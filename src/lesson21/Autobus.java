package lesson21;

public class Autobus {

    /*
    Для создания связи типа HAS-A мы определяем поле класса,
     которое будет хранить ссылку на объект поля класса

     Ассоциация (в том числе и Агрегация и Композиция)
     реализуется через создание ссылок на другие объекты
      внутри класса.
      Отношение, где один класс использует другой в качестве одного из своих полей

      Агрегация Автобус и Водитель. Автобус содержит Водителя, но они могут
      существовать отдельною

      Композиция Автобус Автопилот. Автопилот не существует вне этого автобуса.

      Кардинальность связи. Определяет, сколько объектов одного класса может быть ассоциировано с объектом другого класса


      Один к одному: Автобус - Двигатель,
      Один ко многим:  Автобус список пассажиров,
      Много ко многим: Список автобусов - Список остановок.



     */

    private static int counter = 1;

    private final int id;

    private BusDriver driver; // агрегация ("мягкая" связь)
    private Autopilot autopilot; // композиция (жесткая / неразрывная связь)

    private final int capacity;
    private int countPassenger;

    private final Passenger[] passengers;

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.capacity = capacity;
        this.driver = busDriver;
        this.autopilot = new Autopilot("AP-v001");
        // Реализуем двунаправленную связь
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity];
    }

    public void showListOfPassengers() {
        if (countPassenger == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassenger; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassenger - 1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        /*
        1. Надо проверить свободное место
        2. Находится ли этот пассажир уже в нашем автобусе?
        3. Если есть место и пассажир еще не в автобусе - садим на борт:
            3.1. Добавляем его в список пассажиров
            3.2. Увеличиваем кол-во пассажиров в автобусе
            3.3. Возвращаем true
        4. Если что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
         */

        if (countPassenger < capacity) {
            // Место есть
            // Надо проверить, есть ли такой пассажир уже в автобусе
            if (isPassengerInBus(passenger)){
                System.out.printf("Пассажир id %d уже в автобусе с id %d\n",
                        passenger.getId(), this.id);
                return false;
            }

            // Садим на борт пассажира
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир id %d завершил посадку в автобус с id %d\n",
                    passenger.getId(), this.id);
            return true;
        }

        // Сводного места нет
        System.out.printf("В автобусе id %d свободных мест нет!\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        // пассажира с таким id нет в нашем массиве пассажиров
        return false;
    }

    public void updateAutopilotVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    public void installNewAutopilot(String softwareVersion) {
        // Следим за правильностью ссылок с обеих сторон двунаправленной связи
        this.autopilot.setAutobus(null);
        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public String toString() {
        return "Autobus: {id: " + id + ", capacity: " + capacity +
                "; driver: " + driver.toString() +
                "; autopilot: " + autopilot.toString() +
                "}";
    }
}

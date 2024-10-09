package lesson20.transport;

public class Bus extends Vehice{
    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity){
        super(model, year);
        this.capacity = capacity;


    }

    public int getCapacity() {
        return capacity;
    }
    public boolean takePassenger(){
        //Проверить, есть ли свободные места
        if (countPassengers < capacity){
            countPassengers++;
            System.out.println("Пассажир вошел в автобус" + this.getModel());
            return true;
        }
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров ", this.getModel(), countPassengers);
        return false;

    }
    public boolean dropPassenger(){
        //Проверить, есть ли пассажиры в автобусе
        if (countPassengers > 0) {
            countPassengers--;

            System.out.println("Пассажир вышел из автобуса" + this.getModel());
            return true;
        }
            System.out.printf("В автобусе %s больше нет пассажиров. Сейчас %d пассажиров ", this.getModel(), 0);
            return false;
            }




   public int getCountPassengers() {
    return countPassengers;
    }

    }


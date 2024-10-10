package homework21;

public class Storage extends Component{
    private int capacity; // Емкость накопителя в ГБ


    public Storage(String brand, String model, int capacity) {
        super(brand, model); // Вызов конструктора базового класса Component
        this.capacity = capacity;
    }



    public void displayInfo() {
        super.printInfo();
        System.out.println("Storage Capacity: " + capacity + " GB");
    }

}

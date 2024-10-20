package homeworksss.homework21;

public class Memory extends Component{

    private int size;

    public Memory(String brand, String model, int size) {
        super(brand, model); // Вызов конструктора базового класса Component
        this.size = size;
    }

    public void displayInfo() {
        super.printInfo();
        System.out.println("Memory Size: " + size + " GB");
    }

}

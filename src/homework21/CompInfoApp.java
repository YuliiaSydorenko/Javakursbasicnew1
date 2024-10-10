package homework21;

public class CompInfoApp {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Core x7 -357", 4.2);
        Memory memory = new Memory("CGJY", "Teruyi", 14);
        Storage storage = new Storage("DELL", "D87876", 256);


        Computer computer = new Computer(processor, memory, storage);
        computer.printInfo();


    }
}

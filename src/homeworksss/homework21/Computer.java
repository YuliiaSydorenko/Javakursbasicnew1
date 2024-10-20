package homeworksss.homework21;

public class Computer extends Component {
    private Processor processor;
    private Memory memory;
    private Storage storage;
    public Computer(Processor processor, Memory memory, Storage storage){
        super();
        this.processor = processor;
         this.memory = memory;
         this.storage = storage;


    }
    public void  printInfo(){
        System.out.println("Comonents:");
        processor.printInfo();
        memory.printInfo();
        storage.printInfo();
    }

    public Storage getStorage() {
        return storage;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
package homework21;

public class Processor extends Component {

    private double frequency;

    public Processor(String brand, String model, double frequency){
        super(brand, model);
        this.frequency = frequency;

    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Frequency:" + frequency );
    }
}

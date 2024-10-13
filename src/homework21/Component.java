package homework21;

public class Component {
    protected String brand;
    protected String model;
    public Component(String brand, String model){
        this.brand = brand;
        this.model = model;

    }

    public Component() {

    }

    public void printInfo(){
        System.out.println("Brand: " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

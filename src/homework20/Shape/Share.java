package homework20.Shape;

public class Share {
    String name;

    public Share (String name) {
        this.name = name;
        System.out.println("Shape: " + name);
    }

    public Share() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
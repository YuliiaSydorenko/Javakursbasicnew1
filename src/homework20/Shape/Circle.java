package homework20.Shape;

public class Circle extends Share{
    private double radius;
    public static final double PI = 3.141592653589793;

    public Circle(String name) {
        super(name);
    }

    public Circle() {
        super();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
    }


    public void displayInfo() {
    }
}

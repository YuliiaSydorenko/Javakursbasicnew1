package homeworksss.homework20.Shape;

public class Rectangle extends Share {
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
    }

    public Rectangle() {
        super();
    }

    public void setDimensions(double width, double height){
        this.width = width;
        this.height = height;

    }
    public double calculateArea(){
        double area = width * height;
        System.out.println("Rectangle area: " + area);
        return area;
    }


    public void displayInfo() {
    }
}

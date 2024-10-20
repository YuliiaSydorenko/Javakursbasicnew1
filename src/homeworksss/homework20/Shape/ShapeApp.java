package homeworksss.homework20.Shape;


public class ShapeApp {
    public static void main(String[] args) {


        // Создание объекта Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setName("Rectangle");
        rectangle.setDimensions(5.0, 3.0);
        rectangle.displayInfo();
        rectangle.calculateArea();

        // Создание объекта Circle
        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setRadius(4.0);
        circle.displayInfo();
        circle.calculateArea();
    }
}

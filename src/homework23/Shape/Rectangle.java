package homework23.Shape;
class Rectangle extends Shape{
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
       // this.type = "Rectangle";

    }


    @Override
    public double calculateArea() {
        return width * height;
    }


    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

}

package homeworksss.homework23.Shape;

class Circle extends Shape{
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
        //this.type = "Circle";
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}

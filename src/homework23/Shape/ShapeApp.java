package homework23.Shape;

class ShapeApp  {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        // Инициализация объектов разными фигурами
        shapes[0] = new Circle(5);             // Круг с радиусом 5
        shapes[1] = new Rectangle(4, 6);       // Прямоугольник 4x6
        shapes[2] = new Triangle(3, 4, 6);     // Треугольник со сторонами 3, 4, 5

        // Переменные для хранения общей площади и периметра всех фигур
        double totalArea = 0;
        double totalPerimeter = 0;

        // Цикл по массиву фигур для вычисления общей площади и периметра
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        // Вывод общей площади и периметра всех фигур
        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter:  " + totalPerimeter);
    }
    }


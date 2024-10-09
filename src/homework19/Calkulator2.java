package homework19;

public class Calculator {
    public static final double PI = 3.141592653589793;

    // Статический метод для сложения
    public static double add(double a, double b) {
        return a + b;
    }

    // Статический метод для вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Статический метод для умножения
    public static double multiply(double a, double b) {
        return a * b;
    }


    // Статический метод для деления
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    // Метод для вычисления площади круга (π * r^2)
    public static double circleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Ошибка: Радиус не может быть отрицательным");
        }
        return PI * Math.pow(radius, 2);  // Формула: π * r^2
    }

    // Метод для вычисления длины окружности (2 * π * r)
    public static double circleCircumference(double radius) {

        if (radius <= 0) {
            throw new IllegalArgumentException("Ошибка: Радиус не может быть отрицательным, или = 0");
        }
        return 2 * PI * radius;  // Формула: 2 * π * r
    }

    public static double circlang(double r, double pi) {
        if (r <= 0) {
            throw new IllegalArgumentException("Ошибка: Радиус не может быть отрицательным, или = 0");
        }

            return r;
        }
    }



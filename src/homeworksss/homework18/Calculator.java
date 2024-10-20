package homeworksss.homework18;

public class Calculator {
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


}


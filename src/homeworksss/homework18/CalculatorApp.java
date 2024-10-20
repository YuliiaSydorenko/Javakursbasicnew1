package homeworksss.homework18;

public class CalculatorApp {
    public static void main(String[] args) {


        double a = 14.5;
        double b = 2.0;

        // Вызов методов класса
        System.out.println("Addition: " + Calculator.add(a, b));
        System.out.println("Subtraction: " + Calculator.subtract(a, b));
        System.out.println("Multiplication: " + Calculator.multiply(a, b));
        System.out.println("Division: " + Calculator.divide(a, b));
    }
}

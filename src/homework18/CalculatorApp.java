package homework18;

public class CalculatorApp {
    public static void main(String[] args) {


        double a = 24.5;
        double b = 2.0;

        // Вызов методов класса
        System.out.println("Addition: " + Calculator.add(a, b));         // 15.5
        System.out.println("Subtraction: " + Calculator.subtract(a, b)); // 5.5
        System.out.println("Multiplication: " + Calculator.multiply(a, b)); // 52.5
        System.out.println("Division: " + Calculator.divide(a, b));     // 2.1
    }
}

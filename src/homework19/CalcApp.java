package homework19;

import static java.lang.Math.*;

public class CalcApp {
    private static double circumference;

    public static void main(String[] args) {


        double a = 14.5;
        double b = 2.0;
        //double pi = PI;
        double r = 5.0;







        Calculator calc = new Calculator();

        System.out.println("Addition: " + Calculator.add(a, b));
        System.out.println("Subtraction: " + Calculator.subtract(a, b));
        System.out.println("Multiplication: " + Calculator.multiply(a, b));
        System.out.println("Division: " + Calculator.divide(a, b));

        // Площадь и длина окружности
        double radius = 3.0;
        System.out.println("Площадь круга с радиусом " + radius + ": " + Calculator.circleArea(radius));
        System.out.println("Длина окружности с радиусом " + radius + ": " + Calculator.circleCircumference(radius));



      



    }
    }








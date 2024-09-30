package lesson05;

import java.util.Scanner;


public class ScannerExample{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();


        // Прочитать целое число
        System.out.println("Введите ваш возраст: ");

        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите ваш рост: ");

        double height = scanner.nextDouble();
        scanner.nextLine();



        //Считать число int


        System.out.println(age);
        System.out.println(height);
        System.out.println(name);

        System.out.println(" Продолжение программы");



    }

}

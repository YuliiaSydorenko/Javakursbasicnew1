package homework07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Task 1
        //Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
        //
        //Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.println("Вы ввели: Один");
                break;
            case 2:
                System.out.println("Вы ввели: Два");
                break;
            case 3:
                System.out.println("Вы ввели: Три");
                break;
            default:
                System.out.println("Ошибка: введите число 1, 2 или 3.");


        }
    }
}






package homework05;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        //Попросите пользователя ввести строку чётной длины с клавиатуры.
        //Распечатайте два средних символа строки.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строку четной длинны:");
        String input = scanner1.nextLine();
        //if (input.length() % 2 == 0) {
        int middleIndex = input.length() / 2 - 1;

        // Получаем два средних символа
        char middleChar1 = input.charAt(middleIndex);
        char middleChar2 = input.charAt(middleIndex + 1);
        // Выводим два средних символа

        //Для строки "string" результат будет "ri"
        System.out.println("Для указанной строки результат будет: "  + middleChar1 + middleChar2);


    }
}



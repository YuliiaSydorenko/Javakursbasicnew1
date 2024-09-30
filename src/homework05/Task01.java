package homework05;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
        //Используя Scanner, сохраните имя в переменную типа String.
        //Выведите на экран количество символов в имени пользователя.
        //Создайте две переменные типа char:
        // одна должна хранить первый символ имени,
        // другая — последний.
        //Выведите на экран десятичный код (код символа в десятичной системе счисления)
        // первого и последнего символа имени.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        int length = name.length();

        System.out.println("Количество символов в имени: " + length);
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        System.out.println("Первый символ имени: " + firstChar);
        System.out.println("Последний символ имени: " + lastChar);

        System.out.println("Код первого символа '" + firstChar + "': " + (int) firstChar);
        System.out.println("Код  последнего символа '" + lastChar + "': " + (int) lastChar);
    }


    }


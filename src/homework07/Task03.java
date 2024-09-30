package homework07;

import java.util.Random;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //Task 3 (Повышенной сложности, опционально)
        //Программа предлагает пользователю ввести четырехзначное число.
        //Ввод осуществляется только в формате строки (String).
        //Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число с клавиатуры: ");
        String input = scanner.nextLine();

        if (input.length() == 4) {
            System.out.println("Вы ввели корректное четырехзначное число: " + input);
        } else {
            System.out.println("Ошибка: введенное значение не является четырехзначным числом.");


        }


    }
}

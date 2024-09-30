package homework08;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        //Программа запрашивает у пользователя ввод произвольного числа.
        // Вывести сумму цифр этого числа.
        //
        //Пример: 567432 -> 5+6+7+4+3+2 -> 27

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное число: ");
        int inp = scanner.nextInt();
        String input = scanner.nextLine();


        int summ = 0;

        while (inp > 0){
        int digits = inp %10;
        inp /=10;
        summ += digits;

        if (inp > 0) {
            System.out.print(" + ");}
        else {
             System.out.print(" = ");
        }

        System.out.print(digits + "");}
        System.out.print("=>" +summ);






    }
}

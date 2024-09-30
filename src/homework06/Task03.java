package homework06;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //Задание 3
        //Спросите пользователя, введите число с клавиатуры.
        //Ваша программа должна выводить текст в формате:
        //Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
        //Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
        //проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите целое число с клавиатуры: " );
        int a1 = scanner1.nextInt();
        scanner1.nextLine();

        //Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
        //Число: 3 четное: false; кратно 3: true; четное и кратное 3: false

        boolean isEven = a1 % 2 == 0;
        boolean isDivisibleBy3 = a1 % 3 == 0;
        boolean isED = isEven && isDivisibleBy3;
        System.out.println("Число: " + a1);
        System.out.println("Четное: " + isEven);
        System.out.println("Делится на 3: " + isDivisibleBy3);
        System.out.println("Число четное и делится на 3: " + isED);



       // System.out.printf("Число: %d; Четное: %s: Делится на 3: %s: Число четное и делится на 3: %s\n");


    }
}

package homework07;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        //Task 2
        //Запишите в 4 переменные случайные числа от 0 до 100.
        //Выведите все 4 числа на экран.
        //Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.

        Random random = new Random();

        int x1 = random.nextInt(101);
        int x2 = random.nextInt(101);
        int x3 = random.nextInt(101);
        int x4 = random.nextInt(101);
        System.out.println("x1:  " + x1);
        System.out.println("x2:  " + x2);
        System.out.println("x3:  " + x3);
        System.out.println("x4:  " + x4);
        int max = x1;
        if (x2 > max) {
            max = x2;
        }
        if (x3 > max) {
            max = x3;
        }
        if (x4 > max) {
            max = x4;
        }
        System.out.println("Максимальное число: " + max);




    }
}

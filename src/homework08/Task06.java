package homework08;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        //Создать массив целых чисел произвольной длины от 5 до 15.
        // Заполнить массив случайными значениями от -50 до 50.
        //Вывести на экран:
        //Минимальное значение в массиве
        //Максимальное значение в массиве
        //Среднее арифметическое всех значений в массиве
        Random random = new Random();
        int rand = random.nextInt(11) + 5;
        int[] arrial = new int[rand];
        int x1 = 0;
        while (x1 < arrial.length) {
            arrial[x1] = random.nextInt(101) - 50; // случайное число от -50 до 50
            x1++;
        }
        x1 = 0;
        System.out.print("Массив: " );

        int min = arrial[0];
        int max = arrial[0];
        int sum = 0;
        x1 = 0;
        while (x1 < rand) {
            if (arrial[x1] < min) {
                min = arrial[x1];}
            if (arrial[x1] > max) {
                max = arrial[x1];}
            sum += arrial[x1];
            x1++;
        }

        double average = (double) sum / rand;
        x1 = 0;
        while (x1 < rand) {
            System.out.print(arrial[x1] + " ");
            x1++;
        }

        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Среднее арифметическое всех значений в массиве: " + average);

    }
}

package homework14;

import java.util.Arrays;
import java.util.Random;

public class HW14_2 {
    public static void main(String[] args) {


        //Сумма четных чисел
        //Напишите метод, который вычисляет сумму всех четных чисел в массиве.
        int[] array = {1, 2, 3, 4, 5, 6, 4, 7, 8, 4};
        int sum2 = Arrays.stream(array).sum();


        for (int i = 0;   i < array.length; i++) {
            if (array[i] % 2 == 0) {

                sum2 += array[i];
            }
        }
            System.out.println("Сумма четных чисел массива: " + sum2);

        }
    }


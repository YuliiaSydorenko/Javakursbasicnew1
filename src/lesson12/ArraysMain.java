package lesson12;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {

    public static void main(String[] args) {
        int[]ints = {1, 5, 76, 45, 3, 87, 58, 4, 68};
        System.out.println(ints.length);

        int index = ArraysUtils.linearSearch(ints, 100);
        System.out.println("index" + index);


        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(ints));

        ArraysUtils.sortSelection(ints);
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(ints));

        int number = 87;
        int idx = ArraysUtils.binarySearch(ints, number);
        System.out.println("Индекс числа в массиве: " + idx);

        int[] testArray = new int[1_000_000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++){
            testArray[i] = random.nextInt(10_001);

        }
        System.out.println("\n ================== \n");

        // ArraysUtils.sortSelection(testArray);
        Arrays.sort(testArray); // сортировка. Разберем позже

        number = 5000;
        idx = ArraysUtils.binarySearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (бинарный поиск): " + idx);

        idx = ArraysUtils.linearSearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (линейный поиск): " + idx);

    }

}

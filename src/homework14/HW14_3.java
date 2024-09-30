package homework14;

import java.util.Arrays;

public class HW14_3 {
    public static void main(String[] args) {


        //Найти второе по величине число в массиве
        //Напишите метод, который находит второе по величине число в массиве целых чисел.

        int[] array = {1, 2, 3, 4, 5, 6, 4, 7, 8, 4};
        int max1 = firstmax(array);
        int max2 = findSecondLargest(array);
        System.out.println("Второе по величине число массива: " + max2);

    }

    private static int findSecondLargest(int[] array) {


    public static int firstMax(int[] array) {
        if (array.length < 2){throw new IllegalArgumentException("Минимум 2 элемента") {
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int l = array.length;



            for (int i = 0; i < array.length; i++){
                if (array[i] > max) {
                    max2 = max;
                    max = array[i];

            } else if (array[i] > max2 && array[i] != max) {
                    max2 = array[i];



            if (max2 = Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Массив не содержит второго уникального числа")
            }

            }

        }
    }
}
//public class Main {
//    public static void main(String[] args) {
//        // Пример массива
//        int[] array = {3, 5, 7, 2, 8, 6, 10, 8, 9};
//
//        // Вызов метода для поиска второго по величине числа
//        int secondLargest = findSecondLargest(array);
//
//        // Вывод результата
//        System.out.println("Второе по величине число: " + secondLargest);
//    }
//
//    // Метод для нахождения второго по величине числа в массиве
//    public static int findSecondLargest(int[] array) {
//        if (array.length < 2) {
//            throw new IllegalArgumentException("Массив должен содержать как минимум два элемента");
//        }
//
//        int max = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//
//        for (int i = 0; i < array.length; i++) {
//            // Обновляем наибольшее значение и второе по величине
//            if (array[i] > max) {
//                secondMax = max; // Предыдущее наибольшее значение становится вторым по величине
//                max = array[i];  // Обновляем наибольшее значение
//            } else if (array[i] > secondMax && array[i] != max) {
//                // Обновляем второе по величине, если текущее число больше второго, но меньше максимума
//                secondMax = array[i];
//            }
//        }
//
//        // Если второе по величине число не обновилось (например, все числа одинаковы)
//        if (secondMax == Integer.MIN_VALUE) {
//            throw new IllegalArgumentException("Массив не содержит второго по величине уникального числа");
//        }
//
//        return secondMax;
//    }
//}
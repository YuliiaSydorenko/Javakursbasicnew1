package homework11;

public class Task02 {
    public static void main(String[] args) {
        //Task 2
        //Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
        double[] array = {1, 2.2, 2.3, 4, 5.7, 12, 7.4, 8, 9,10};
        int length = array.length;
        double average = calculateAverage(array);




        System.out.println("Среднее арифметическое: " + average);
    }

    public static double calculateAverage(double[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Не корректный массив!");
            return Integer.MIN_VALUE;
        }


        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        return  sum / array.length;

    }
    }


    // int[] array = {};  // Пример пустого массива
//
//        // Проверка, пустой ли массив
//        if (isArrayNotEmpty(array)) {
//            System.out.println("Массив не пустой.");
//        } else {
//            System.out.println("Массив пустой.");
//        }
//    }
//
//    // Метод для проверки, не является ли массив пустым
//    public static boolean isArrayNotEmpty(int[] array) {
//        return array != null && array.length > 0;
//    }
//}

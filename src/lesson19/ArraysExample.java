package lesson19;

import java.util.Arrays;

public class ArraysExample {
    //Метод, который возвращает строковое представление массива

    public static void main(String[] args) {

        int[] array = {1, 2, 6, 4, 5 ,3 };

        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));

        System.out.println("===============Сортировка массива=============");
       // Arrays.sort(array);// полная сортировка массива
      //  System.out.println(Arrays.toString(array));

        Arrays.sort(array,1, 3);// частичная сортировка массива
        System.out.println(Arrays.toString(array));


        System.out.println("=============Бинарный поиск============");
        int index = Arrays.binarySearch(array, 6);
        System.out.println("index:" + index);

        System.out.println("============Сравнение массивов на равенство ===========");

        int[] test = {1,2,3,4,5,6};
        System.out.println("array.equals(test); " + array.equals(test));

        // Значения внутри массивов одинаковые, но расположены в разной последовательности, значит массивы не равны

        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("Array.equals(arrays, test); " + isArraysEquals);

        // Находит и возвращает индекс первого различия между массивами
        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("Arrays.mismatch(array, test:" + mismatchIndex);

        System.out.println("============Многомерные массивы===========");
        int[][] arrayD = new int[3][4];
        System.out.println(Arrays.deepToString(arrayD));

        //Сравнение многомерных массивов
        int[][] arrayC = new int[3][4];
        boolean isEquals = Arrays.deepEquals(arrayD,arrayC);
        System.out.println("Arrays.deepEquals(arrayD,arrayC): " + isEquals);

        arrayC [0][2] = 1;
        arrayC [2][2] = 5;
        System.out.println(Arrays.deepToString(arrayC));

        //copyOf - создает новый массив заданной длинны. При этом копирует элементы старого массива.
        // К-во копируемых эл-тов равно старому массиву
        System.out.println("testArray:" + Arrays.toString(test));

        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));
        copyOfTest = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copyOfTest));

        System.out.println("==========copyOfRange==============");
        //Создает новый массив и записывает в него значения от индекса from до индекса to

        int[] ints = {1,2,3,4,5,5, 7,8,6};
        int[] rangeFromInts = Arrays.copyOfRange(ints,3,10);
        System.out.println("Arrays.toString(rangeFromInts: "+ Arrays.toString(rangeFromInts));

        //Получить новый массив со значениями старого
        int[] copyOfInts = Arrays.copyOf(ints,ints.length);
        System.out.println("Arrays.copyOf(ints,ints.length: " + Arrays.toString(copyOfInts));

       copyOfTest = Arrays.copyOfRange(ints,0,ints.length);
        System.out.println("Arrays.copyOf(ints,ints.length: " + Arrays.toString(copyOfTest));

        System.out.println("===========System.arraycopy===============");
        //
        // Принимает 5 параметров:
        // 1. Массив донор.
        // 2. Индекс с которого мы берем значения.
        // 3. Массив в который записываем значения
        // 4. Индекс с которого начать запись значений
        // 5. Количество копируемых значений

        int [] target = new  int[20];
        System.arraycopy(ints, 3, target, 1, 5);
        System.out.println(Arrays.toString(target));

        int [] arr = new  int[5];
        Arrays.fill(arr, 10);
        Arrays.fill(arr, 2, 4,100);
        System.out.println(Arrays.toString(arr));













    }


}

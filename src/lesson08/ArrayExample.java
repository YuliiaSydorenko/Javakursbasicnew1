package lesson08;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        // МАССИВ
        // ЭЛЕМЕНТ
        // ИНДЕКС
        // ЗНАЧЕНИЕ ЭЛЕМЕНТА
        int[] arrays; //[] = обьявление массива
        String[] stringz;
        //   int array1 [];

        arrays = new int[4];
        stringz = new String[10];

        int[] array2 = new int[8];

        int val = arrays[0];
        System.out.println("val: " + val);
        System.out.println("array2[3] " + array2[3]);
        System.out.println("string " + stringz[4]);
        System.out.println(arrays); //[I@4411d970

        //явная иннициализация массива

        int[] num = new int[]{45, 56, 34, 1, 159};
        int[] num1 = {45, 678, 678};

        int val1 = num[0];

        num[2] = 100;
        System.out.println("num: " + num);
        System.out.println("val1: " + val1);
        System.out.println("num1: " + num[2]);
        int j = 0;

        System.out.print(num1[j++] + ";");
        Random random = new Random();

        int[] nums = new int[10];
        int k = 0;
        System.out.println("[");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.println(nums[k] + ", ");
            k++;
            //Найти минимальное значение
            int min = 0;
            int i = 0;

            while (i < nums.length) {
                if (nums[i] < min) {
                    min = nums[i];
                }
                i++;

            }


        }
    }
}


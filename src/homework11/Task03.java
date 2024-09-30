package homework11;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        //Task 3 * (Опционально)
        //Написать метод, который проверяет,
        // является ли массив палиндромом
        // (читается одинаково с обоих концов).

        int[] array = {1,7, 3, 4, 5, 4, 3, 2, 1};
        int length1 = array.length;


        if (isPalindrome(array)) {
            System.out.print((Arrays.toString(array)) + "является палиндромом");
        } else {
            System.out.print((Arrays.toString(array)) + "не является палиндромом");
        }

    }

    public static boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Не корректный массив!");
            return false;}


            int n = array.length;
            for (int i = 0; i < n / 2; i++) {
                if (array[i] != array[n - 1 - i]) {
                    return false;
                }

            }
            return true;
        }
    }


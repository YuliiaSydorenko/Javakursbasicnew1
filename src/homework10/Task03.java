package homework10;

import java.util.ArrayList;
import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {


        //Написать метод, принимающий на вход массив целых чисел.
        //Метод должен вернуть массив, состоящий только из простых чисел,
        // присутствующих в изначальном массиве
        //вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}


        int[] originalArray = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] primes = getPrimes(originalArray);

        // Вывод простых чисел
        System.out.println(Arrays.toString(primes));
    }

    public static int[] getPrimes(int[] array) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int num : array) {
            if (isPrime(num)) {
                primeList.add(num);
            }
        }
        int[] primeArray = new int[primeList.size()];
        for (int i = 0; i < primeList.size(); i++) {
            primeArray[i] = primeList.get(i);
        }
        return primeArray;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Скопировать проверку из кода урока!, Очень полезная!!!!!



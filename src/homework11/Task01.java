package homework11;

public class Task01 {
    public static void main(String[] args) {
        //Task 1
        //Написать метод, который считает сумму всех элементов в массиве.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumOfArray(array);



        System.out.println("Сумма всех элементов в массиве: " + sum);
    }

    public static int sumOfArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Не корректный массив!");
            return Integer.MIN_VALUE;
        }
        int sum = 0;
        for (int num : array) {
            sum += num;

        }

        return sum;
    }
}


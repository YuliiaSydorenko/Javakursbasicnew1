package homework08;

public class Task07 {
    public static void main(String[] args) {

        //Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
        //Пример: { 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
        int[] array = {5, 6, -25, 0, 31, -15}; // Пример массива

        // Проверка, что массив не пустой и содержит хотя бы два элемента
        if (array.length < 2) {
            System.out.println("Массив слишком мал для выполнения операции.");
            return;
        }
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        // Вывод массива до изменения
        System.out.println("Массив до изменения:");
        printArray(array);

        // Поменять местами элементы с минимальным и максимальным значениями
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        // Вывод массива после изменения
        System.out.println("Массив после изменения:");
        printArray(array);
    }

    // Метод для печати элементов массива
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // Переход на новую строку

    }
}

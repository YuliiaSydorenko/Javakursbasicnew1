package lesson12;

public class ArraysUtils {
    // Метод линейного поиска элемента в массиве
    //Осуществление перебора всех элементов и сравнение с искомым значением
    // Если значение найдено - возвращается индекс элемента массива,
    // если нет - возвращается -1

    //Однозначно сказать, что число отсутствует в массиве
    //потребует перебрать абсолютно все элементы массива -> 0(n)

    public static int linearSearch(int[]array, int searchValue){
        int counter = 0;

        for ( int i = 0; i < array.length; i++){
            if (array[i] == searchValue){
                System.out.println("Линейный поиск нашел за: " + counter + "шагов");
                return i;
            }
        }
        System.out.println("Линейный поиск НЕ нашел за: " + counter + "шагов");
        return -1;

    }
    public static int minIndex(int[]array){
        int min = array[0];
        int minIndex = 0;
        for (int i =1; i < array.length; i++){
            if ( array[i] < min){
                min = array[i];
                minIndex = 1;

            }
        }
        return  minIndex;
    }

    public static int minIndex(int[]array, int statIndex) {
        int min = array[statIndex];
        int minIndex = statIndex;
        for (int i = statIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

            return minIndex;
        }
// Метод ищет минимальное значение в части массива от стартового индекс и до конца массива
// возвращает индекс минимального значения

    public static void sortSelection(int[] array){
        for (int i = 0; i < array.length; i++){
            int localMin = minIndex(array, i);
            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;}

        }
        // Бинарный поиск значения в массиве

    public static int binarySearch(int[]array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0;

        // Проверка, что часть массива можно разделить пополам

        while (startIndex <= endIndex) {
            counter++;
            //вычислить средний индекс
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // Сравнивание значения в середине части массива с искомым

            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за " + counter + "шагов");
                return middleIndex;
            }
            //Если значения не равны
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;

            }

        }
        // Если цикл окончен (больше нельзя делить пополам),
        // значит искомое значение в массиве отсутствует
        System.out.println("Значение не найдено! Шагов сделано: " + counter);
        return -1;
    }

}










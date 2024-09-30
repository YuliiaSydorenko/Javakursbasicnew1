package homework10;

public class Task02 {

    //Написать метод, принимающий на вход массив строк.
    // Метод должен вернуть массив, состоящий из самой короткой
    // и самой длинной строки изначального массива.


    public static void processStringArray(String[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            System.out.println("Массив пуст.");
            return; // Выход из метода, если массив пустой
        }
        String shortest = inputArray[0];
        String longest = inputArray[0];

        for (String str : inputArray) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println("Самая короткая строка: " + shortest);
        System.out.println("Самая длинная строка: " + longest);
    }
    public static void main(String[] args) {

        String[] strings = {"One", "Three", "Twenty", "Five", "Four"};

        processStringArray(strings);
    }
}

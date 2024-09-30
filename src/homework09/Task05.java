package homework09;

public class Task05 {
    //Написать метод, который принимает массив строк.
    // Вывести на экран все символы самой длинной строки из массива.
    //Пример:
    //{ "One", "Two", "Twenty" } ->
    //T
    //w
    //e
    //n
    //t
    //y
    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Twenty"};


        String longestString = "";



        for (String str : strings) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }


        for (char ch : longestString.toCharArray()) {
            System.out.println(ch);
        }

    }
}

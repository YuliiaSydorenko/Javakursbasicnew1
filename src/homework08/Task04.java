package homework08;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
//Напишите программу, которая просит пользователя ввести слово "hello".
// Если пользователь вводит правильное слово, программа благодарит его и завершает работу. Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.
//
//Дополнительно: Подсчитайте количество попыток,
// потребовавшихся для ввода правильного слова, и выведите это количество на экран.

       Scanner scanner = new Scanner(System.in);

        String correct = "hello";
        String userInput;
        int nCount = 0;
        do {
            System.out.println("Введите с клавиатуры слово \"hello\"");
            userInput = scanner.nextLine();
            nCount++;

        }while (!userInput.equalsIgnoreCase(correct));
        System.out.println("Спасибо! Вы ввели правильное слово.");
        System.out.println("Количество попыток: " + nCount);


    }
}

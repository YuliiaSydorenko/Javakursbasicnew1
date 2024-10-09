package lesson20;

import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "Java " + "is " + " the " + "best";

        /*
         StringBuilder - это класс, предназначенный для эффективного создания
          и модификации изменяемых последовательностей символов.
         */
        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" ").append("Java");

        //Получить строковое представление
        String string = sb.toString();
        System.out.println(string);

        //Вставить символы в указанную позицию
        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(6, "beatiful ");
        System.out.println(sb2);

        //Заменить подстроку (определяет индексами) на указаное значение

        StringBuilder sb3 = new StringBuilder("Hello World!");
        sb3.replace(6,11, "Java");
        System.out.println(sb3);

        //Удалить подстроку в диапазоне
        StringBuilder sb4 = new StringBuilder("Hello World!");
        sb4.delete(5,11);
        System.out.println(sb4);

        //Реверс разворачивает в обратную сторону
        StringBuilder sb5 = new StringBuilder("Hello World!");
        sb4.reverse();
        System.out.println(sb5);

        //Количество символов
        System.out.println("sb5.lenght():" + sb5.length());

        //Получить символ по индексу
        char ch = sb5.charAt(3);
        System.out.println(ch);

        //Получить подстроку
        sb = new StringBuilder("Hello World");
        String subString = sb.substring(1);
        System.out.println("sb.substring(3):" + subString);
        subString = sb.substring(6, 9);
        System.out.println("sb.substring(6, 9: " + subString);
        sb= new StringBuilder("Hello");
        sb.setLength(10);
        System.out.println(sb);
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8)" + (int)ch1);

        sb.setLength(3);
        System.out.println("sb.setLength: " + sb);

        /*
        Написать метод, который
        запрашивает у пользователя строку и возвращает аббревиатуру
         */
        System.out.println("Aббревиатура: " );

    }
    public static String phraseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов");
        String inout = sc.nextLine();

        String[] words = inout.split("");
        StringBuilder sb = new StringBuilder();
        String result = "";


        for (int i = 0; i < words.length; i++){
            String word = words[i];
            sb.append(word.charAt(0));
        }
        return sb.toString().toUpperCase();

    }
}

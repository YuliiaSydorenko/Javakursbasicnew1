package homework04;

public class Task04 {
    public static void main(String[] args) {
        // Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.
        //Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.
        //Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.


        char ch1 = 'y';
        char ch2 = 'u';
        char ch3 = 'l';
        char ch4 = 'i';
        char ch5 = 'i';
        char ch6 = 'a';

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);
        System.out.println(ch6);

       ch1 = (char)(ch1 -32);
       ch2 = (char)(ch2 -32);
       ch3 = (char)(ch3 -32);
       ch4 = (char)(ch4 -32);
       ch5 = (char)(ch5 -32);
       ch6 = (char)(ch6 -32);

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);
        System.out.println(ch6);

        System.out.println("My name ist: " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6);
    }
}

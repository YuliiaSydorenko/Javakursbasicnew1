package homework06;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        //Задание 2
        //создайте две переменные типа int.
        //В первую переменную запишите случайное значение от 0 до 50.
        //Во вторую переменную случайное значение от 0 до 100.
        //(опционально) Во вторую переменную случайное значение от -20 до 30.
        //проверьте:
        //
        //равны ли переменные,
        //не равны ли они,
        //больше ли а, чем б,
        //и меньше ли б, чем а.
        //Вы выводите результаты на экран.

        Random random = new Random();

        int x1 = random.nextInt(51);
        int x2 = random.nextInt(101);
       // int x3 = random.nextInt(51) - 20;

        System.out.println("Cлучайное значение от 0 до 50: " + x1);
        System.out.println("Cлучайное значение от 0 до 100: " + x2);
       // System.out.println("Cлучайное значение от -20 до 30: " + x3);

        boolean ist = x1 == x2;
        System.out.println(x1 + "==" + x2 + "->" + ist);
        boolean ist1 = x1 != x2;
        System.out.println(x1 + "!=" + x2 + "->" + ist1);
        boolean greater = x1 > x2;
        System.out.println(x1 + ">" + x2 + "->" + ist);
        boolean lesser = x2 < x1;
        System.out.println(x2 + "<" + x1 + "->" + lesser);






    }
}

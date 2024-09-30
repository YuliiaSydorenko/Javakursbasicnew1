package homework06;

public class Task01 {
    public static void main(String[] args) {

        //Задание 1
        //Дан текст Programming is fun.
        //
        //Напишите программу, которая проверяет,
        // содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.

        String pif = "Programming is fun";
        System.out.println("Programming is fun");
        boolean containsFun = pif.contains("fun");
        System.out.println("Cодержит ли строка слово 'fun': "  + containsFun );





    }
}

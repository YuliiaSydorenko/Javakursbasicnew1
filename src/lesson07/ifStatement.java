package lesson07;

//if = условие
// else = блок кода


import java.util.Random;
import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        int y = 125;
        y = 20;

        if (y > 11) {
            System.out.println("Всем привет!");
            System.out.println("Сейчас У равен: " + y);}
        else if (y > 7) {
            System.out.println("Мы находимся в ELSE if");
            System.out.println("Сейчас У равен: " + y);}
        else {
            System.out.println("Мы находимся в блоке else");
            System.out.println("Сейчас У равен: " + y);}
        System.out.println("Продолжение программы: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число 1 или 10: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Вы ввели число 1" );
        }
        else if (number ==10){
            System.out.println("Вы ввели число 10");
        }
        else {
            System.out.println("Вы ввели неверное число");
        }

        }


// Нахождение рандомных чисел
{

    Random random = new Random();
    int v1 = random.nextInt (50);
    int v2 = random.nextInt (50);
    int v3 = random.nextInt (50);

    System.out.println(v1 + "|"+ + v2 + "|" + v3);
    int min = v1;
    if (v2 < min){
        min = v2;
    }



    }
}

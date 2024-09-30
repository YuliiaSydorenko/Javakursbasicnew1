package homework09;

public class Task04 {
    public static void main(String[] args) {
        //Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
        //1
        //12
        //123
        //1234
        //12345
        //123456

        for (int i = 1; i <= 9; i++) {
            // Внутренний цикл для вывода цифр в строке
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Переход на новую строку после завершения внутреннего цикла
            System.out.println();
        }
    }
    }


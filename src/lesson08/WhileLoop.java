package lesson08;

public class WhileLoop {
    public static void main(String[] args) {

        // Вывести на экран числа от 1 до 5
        /*int number = 1;

        while (number <= 5) {
        System.out.println(number);
        number++;
        }
        System.out.println("Цикл окончен");

         */
        int number = 100;

        while (number >= 90) {

            System.out.println(number--);

        }
        System.out.println("Цикл окончен");

        // Задача, найти сумму чисел от 1 до 100
        int sum = 0; // Переменная для хранения суммы

        // Цикл для вычисления суммы чисел от 1 до 100
        /* int b = 1;

        while (b = 1; b <= 100; b++) {
            sum += b; // Добавляем текущее число к общей сумме
        }
        // Выводим результат на экран
        System.out.println("Сумма чисел от 1 до 100: " + sum);


        // или

         */
        /* int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
            System.out.println("Сумма чисел от 1 до 100: " + sum);

         */

        int a = 0;

        while (a <= 21) {
            // Проверка, является ли число чётным
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
        //Распечатать каждый символ в отдельной строчке

        String str = "HELLO!";
        int index = 0;

        while (index < str.length()) {

            System.out.println(str.charAt(index ++));


        }
    }
}





package homework07;

import java.util.Random;

public class Task0302 {
    public static void main(String[] args) {
        // //Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
        //        //Примеры:
        //        //
        //        //Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
        //        //Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.

        Random random1 = new Random();
        int y1 = random1.nextInt(10);
        int y2 = random1.nextInt(10);
        int y3 = random1.nextInt(10);
        int y4 = random1.nextInt(10);

        //склейка

        System.out.println("Ваш билет с номером: " + y1 + y2 + y3 + y4);

        if (y1 + y2 == y3 + y4) {
            System.out.println("число счастливое, вы выиграли!");
        } else if (y1 + y2 != y3 + y4) {
            System.out.println("число НЕ является счастливым, попробуйте еще раз! ");



        }
    }
}

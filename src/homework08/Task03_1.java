package homework08;

public class Task03_1 {
        public static void main(String[] args) {
            //Используйте цикл while для решения задачи:
            //
            //Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
            int i = 1;

            while (i <= 100) {

                if (i % 5 == 0) {
                    System.out.println(i); // Выводим число, которое делится на 5
                }
                i++;
            }

        }

}

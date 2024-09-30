package homework08;

public class Task03 {
    public static void main(String[] args) {
        //Используйте цикл while для решения задачи:
        //
        //Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.

        //**Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
        int i = 1;
        int count = 0;
        System.out.println("на 5 делятся: " );

        while (i <= 100 && count < 7) {
            if (i % 5 == 0) {
                System.out.print(i + ",");
                count++;
                i += 5;

                // Выводим число, которое делится на 5
            }
            else i++;

        }

    }
}









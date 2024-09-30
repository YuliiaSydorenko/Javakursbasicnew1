package homework06;

public class Task04 {
    public static void main(String[] args) {
//Задание 4
//Дан следующий код.
// В вашем представлении будет указано,
// какой вывод будет запечатан в консоли после выполнения программы.
// Предскажите, что будет выведено на консоль для результатов от 1 до 5. Объясните краткий свой ответ.


        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10; // (8 + 3) > 10 = true;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5; // (8 - 3) = 5 = true;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24; // (8 * 3) != 24 = false;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2; // (8 / 3) > 2 = true;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2); // !(8 % 3) == 2 = false;
        System.out.println("Result 5: " + result);


    }
}

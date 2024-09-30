package homework08;

public class Task01 {
    public static void main(String[] args) {

//Task 1
//Найдите произведение всех чисел от 1 до 15 включительно.
//
//Результат выведите на экран
        long prod = 1;
        int i = 1;


        while (i <= 15){
            prod *= i;
            i++;
        }
        System.out.println("произведение всех чисел от 1 до 15 включительно: " + prod);

    }
}

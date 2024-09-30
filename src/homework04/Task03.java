package homework04;

public class Task03 {
    public static void main(String[] args) {
        //Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
        //Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int
        // с именем smallNumber.
        //Выводит значение smallNumber на экран.
        //Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.

        long bigNumber = 15000000000L;
        int smallNumber = (int) bigNumber;
        System.out.println("smallNumber: " + smallNumber);
    }
}
//Поскольку 15000000000 больше максимального значения, которое может быть представлено в int
// результат преобразования будет некорректным
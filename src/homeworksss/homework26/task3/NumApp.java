package homeworksss.homework26.task3;

public class NumApp {
    public static void main(String[] args) {
        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // Вывод: 30.0

        // Пример с числами с плавающей точкой
        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0

        // Пример с числами типа Float
        NumericPair<Float> floatPair = new NumericPair<>(3.5f, 2.5f);
        System.out.println(floatPair.sum()); // Вывод: 6.0
    }
    }

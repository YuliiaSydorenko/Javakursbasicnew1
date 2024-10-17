package homework26;

public class PairApp {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World");

        System.out.println("First: " + pair.getFirst()); // Вывод: Hello
        System.out.println("Second: " + pair.getSecond()); // Вывод: World

        pair.swap();
        System.out.println("First: " + pair.getFirst());// Вывод: World
        System.out.println("Second: " + pair.getSecond());// Вывод: Hello


    }
}





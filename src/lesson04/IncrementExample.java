package lesson04;

public class IncrementExample {
    public static void main(String[] args) {
        char letter = 97; //a

        System.out.println("letter: " + letter);
int x = 100;
        System.out.println("x1: " + x++);
        System.out.println("x2: " + x);
        int y = 100;
        System.out.println("y1: " + x++);
        System.out.println("y2: " + x);

        letter++;
        System.out.println("letter: " + letter);
        System.out.println("int из char даст 10-й код символа: " + (int) letter);
    }
}

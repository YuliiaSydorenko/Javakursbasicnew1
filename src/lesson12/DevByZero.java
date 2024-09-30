package lesson12;

public class DevByZero {
    public static void main(String[] args) {
        //
        // int a = 100;
        //int b = 0;
        // int c = a / b;
        //System.out.println(c);

        double a = 100;
        double b = 0;
        double c = a / b;
        double c2 = 5000 / b;

        System.out.println(c);
        System.out.println(c2);
        double test = c - c2;
        System.out.println(test);
        System.out.println(c == c2);
        System.out.println(c > c2);
        test = c + c2;
        System.out.println(test);
        test = c - c2;
        System.out.println(test);
        test = c * -1;
        System.out.println(test);

    }
}

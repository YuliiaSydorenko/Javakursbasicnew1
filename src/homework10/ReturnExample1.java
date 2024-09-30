package homework10;

public class ReturnExample1 {
    public static void main(String[] args) {

    }
    public static int sum(int a, int b) {
        if ( (a > b)) {
            return a + b;
        } else {
            return  "String".length();
        }
    }

    public static void  sum (double a, double b) {
        if (a > b) {
            System.out.println("Error! a > b -c ");

        }
        double result = a + b;

        System.out.println("Method: " + (a + b));
    }


}



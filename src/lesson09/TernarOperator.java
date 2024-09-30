package lesson09;

public class TernarOperator {
    public static void main(String[] args) {
        int x = -5;
        String res;

        if (x >= 0) {
            res = "положительное";
            } else {
            res =  "отрицательное";
            }


              // Тернарный оператор:
        System.out.println("Число " + ((x >= 0) ? "положительное" : "отрицательное"));

        String res1 = (x >= 0) ? "положительное" : "отрицательное";

        System.out.println("Число " +res1);

        //String res1 = (x >= 0) ? "положительное" : "отрицательное";
       // System.out.println("Число" + (x >= 0) ? "положительное" : "отрицательное");
        }
    }


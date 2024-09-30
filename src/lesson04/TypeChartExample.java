package lesson04;

public class TypeChartExample {
    public static void main(String[] args) {


        char a = 'A';
        char a1 = 65;
        char a2 = 0x41;

        char a3 = '\u0041';
        char a4 = '\u15D7';


        a2 = 0x0041;
        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);

        System.out.println("a4: " + a4);

        System.out.println("=================================");
//?????????????????????????????????
char digit0 = 48;
        System.out.println("digit0: " + digit0);


        digit0 = (char) (digit0 + 5);
        int var = 5;
        var += var + 5; var = var + 5;
        System.out.println("var: " + var);

digit0 += 5; // digit0 = (char) (digit0 + 5);
        System.out.println("digit0: " + digit0);


        char letter = 97;
        System.out.println("letter: " + letter);
//Инкремент

        var++; // var += 1; var = var +1;



    }
}
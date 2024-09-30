package lesson07;

public class StringEqals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java");

        System.out.print(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        boolean b1 = (str1 == str2);

        System.out.println("str1 == str2" + b1);
        System.out.println("str1 == str3" + (str1 == str3));
        System.out.println("str1 == str4" + (str1 == str4));


// ВАЖНО
        // Для сравнения строк по их значению используем метод eqals
        boolean b2 = str1.equals(str2);
        System.out.println("str1.equals(str2) ->" + b2);
        System.out.println("str1.equals(str4) ->" + str1.equals(str4));
        System.out.println("str1.equals(str3) ->" + str1.equals(str3));

        System.out.println(str1+ ".equalsIgnorCase(" + str3 + ") ->" + str1.equalsIgnoreCase(str3));

    }
}

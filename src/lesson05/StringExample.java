package lesson05;

public class StringExample {
    public static void main(String[] args) {

        String string = "Java";
        //String string1  = new String();
        String string1 = new String("Hallo");
        System.out.println(string);

        // Получить количество символов  в строке (int)
        int lenght = string.length();

        System.out.println("lenght: " + lenght);
        System.out.println(string.toLowerCase());

        //String иммутабельна (неизменна)
        // Если я хочу сохранить результат работы метода - я должен его сохранить в какую=то переменну

        String stringUpper = string.toUpperCase();
        System.out.println("stringUpper");
        System.out.println("string: " + string);

      stringUpper = stringUpper.toLowerCase();
        System.out.println(stringUpper);

        String str1 = "One";
        String str2 = "1";
        String str3 = "hello";

        String concatStr = str1 + str2 + str3;

       System.out.println("concatStr: " + concatStr );

        System.out.println(1 + 3);
        System.out.println(1 + 3 + " : " + 2 + 3); // здесь 2 и 3 не сложились, а склеились, потоиу что кавычка говорит, что это посто текст
        System.out.println(1 + 3 + " : " + (2 + 3));

        //String concatStr2 = str1.concat(str2).concat(str3).concat();
        //System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3);
        String concatStr4 = str1 + str2 + str3 + "..." + "Java";
String  string2 = "Hello" + "1";
        System.out.println(string2);


        //===========================
        String digits = "0123456789hgjdhgflasud";
        System.out.println(digits);
        System.out.println(digits.length());
        char firstChar = digits.charAt(0);
        char lastChar = digits.charAt(9);
        // Независимо от длинны строки индекс последего символа ВСЕГДА длинна - 1

        System.out.println(+firstChar);
        System.out.println(digits.charAt(4));
        System.out.println(+lastChar);
char lastchar1 = digits.charAt(digits.length() - 1);


// String subString = digits.substring("lastcar: " + lastchar1);
       // System.out.println("subString: " + subString);
       // System.out.println("digits:" + digits);

String subString2 = digits.substring(2, 7);
        System.out.println(subString2);



    }
}


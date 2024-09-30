package homework05;

public class Task02 {
    public static void main(String[] args) {
        //Создайте строки:
        //"Java"
        //"is"
        //"a"
        //"powerful"
        //"language"
        //Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
        //Выведите на экран получившуюся строку и её длину.

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

// 1 способ (сложение)
        String res1 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Склеивание с помощью +: " + res1);
        System.out.println("Длина строки: " + res1.length());

// 2 способ ( склеивание)
        String res2 = str1.concat(" ").concat(str2).concat(" ").concat(str3).concat(" ").concat(str4).concat(" ").concat(str5);
        System.out.println("Склеивание concat(): " + res2);
        System.out.println("Длина строки: " + res2.length());



    }
}

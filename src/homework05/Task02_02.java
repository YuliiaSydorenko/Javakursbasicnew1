package homework05;

public class Task02_02 {
//Замените в результирующей строке слово "powerful" на "super".

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";
        String str6 = "super";

        String res1 = str1 + " " + str2 + " " + str3 +" " + str6 + " " + str5;
        System.out.println(res1);

        //Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        //Выведите на экран значение этой переменной.

       // int index = concatres2.indexOf( "aje");

        //Операции с boolean:
        //Логические операторы:
        //&& — логическое И (true, если оба операнда равны true).
        //|| — логическое ИЛИ (true, если хотя бы один операнд равен true).
        //! — логическое НЕ (инвертирует значение, true становится false и наоборот).

        boolean a = true;
        boolean b = false;


        // Проверка, содержит ли строка подстроку "age"
        boolean s1 = res1.contains("содержит ли строка подстроку \"age\"?");

        // Вывод результата
        System.out.println("Содержит ли строка 'age': " + s1);

    }
}

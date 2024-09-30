package lesson06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {
        boolean bo1 = true;
        boolean bo2 = false;
        int x = 10;
        int y = 5;

        // сравнение на равенство

       boolean b1 = x == y;
        System.out.println(x + "==" + y + "->" + b1);
        b1 = x !=y; // 10 != 5
        System.out.println(x + "!=" + y + "->" + b1);
        b1 = x > y;
        System.out.println(x + ">" + y + "->" + b1);
        y = 10;
        b1 = x > y;
        System.out.println(x + ">" + y + "->" + b1);
        b1 = x >= y;
        System.out.println(x + ">=" + y + "->" + b1);
        x = 7;
        b1 = x < y;
        System.out.println(x + "<" + y + "->" + b1);
        b1 = x <= y;
        System.out.println(x + "<=" + y + "->" + b1);

        b1 = true != false;
        System.out.println(b1);
        b1 = (2 ==2) != (3>5);
        System.out.println(b1);
        String str = "Java is the best";
        //
        // boolean contains = str.concat("Java");
        //System.out.println("str.contains(\"Java\");

        System.out.println("==============Логические операции===============");
        boolean b2 = true;
        b2 = !false;
        System.out.println("!false: " + b2);
        b2 = !(4==5);
        System.out.println(b2);
        //&  - 7'
        //Составные сравнения
        // Рим столица Италии, Берлин столица Голландии

        b2 = true & true;
        System.out.println("true & true");
        b2 = (2 < 5) & (11==10);
        System.out.println("(2 < 5) & (11==10)" + b2);


        //int x1 = 50;

        //boolean x1 = x1 > 0 & x1 < 100;
        //System.out.println(x1);

        // Логическое ИЛИ "|"
        // Достаточно что бы хотя бы одно условие выполнялось

        boolean b4 = true | false;
        System.out.println("true | false" + b4);
        System.out.println("false | false" + (false | false));
        //
        // Введите число четное или кратное 5.
        // Генерация случайного числа
        Random random = new Random();
        int rand = random.nextInt(100); // генерация чисел от 0до 99
        System.out.println("rand: " + rand);
        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 ==0) | (rand % 5 ==0);
        System.out.println("isEven: " + isEven);


        System.out.println("====================");

        boolean b5 = true ^ false;
        System.out.println("true ^ false" + b5);
        b5 = false ^ true;
        System.out.println("false ^ true" + b5);
        b5 = true ^ true;
        System.out.println("true ^ true" + b5);
        b5 = false ^ false;
        System.out.println("false ^ false" + b5);

// Логическое сокращенное "И" = &&

        boolean b6 = true && false;
        System.out.println("true && false" + b6);

        b6 = true && true;
        System.out.println("true && true" + b6);

        b6 = false && false;
        b6 = (2 > 5) && (11==11);

        System.out.println("(2 > 5) && (11==11)" + b6);
        int a = 10;
        int b = 0;
// Правая часть не си=читается, т.к. в левой части у нас false и значение  b7  не зависит от правой
        boolean b7 = (b !=0 ) && (a / b > 2);
        System.out.println("a / b > 2: " + b7);

        // Логическое сокращенное ИЛИ, выдает ТРУ, если хотя бы донна часть выражения равна ТРУ

        boolean b8 = true || (a / b >2);
        System.out.println("b8: " + b8);


        // "Приоритет логической операции"
        System.out.println("+++++++++++++++Приоритет логической операции+++++++++++++++");

        //  ! & ^ | && ||
        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);
        System.out.println(true ^ true && false);

        //  ! & ^ | && ||


















    }
}

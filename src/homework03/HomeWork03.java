package homework03;

public class HomeWork03 {
    public static void main(String[] args) {

        //Задание 1:
        //Переменная 1 - сколько Вам полных лет
        int myAge = 46;
        //Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
        double milkUkr = 42.54;
        //Переменная 3 - Ваше имя (Опционально
        String name = " yuliia";
        System.out.println("my Age" + myAge + "preis Milk Ukr" + milkUkr + "my name is" + name);


        //Задание 2:
        //Объявите 4 переменных типа int со значениями 0, 1, 2, 3
        int mon = 0;
        int din = 1;
        int met = 2;
        int don = 3;
        //Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4.
        // Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        int fulltimeSumm = (mon + din + met + don);
        int midlarifmetic = fulltimeSumm/4;

        System.out.println("Midlarifmetic:" + midlarifmetic);
        //Сколько программа отбросила в дробной части?
        int resultRest = fulltimeSumm - midlarifmetic * 4;

        System.out.println("Resultat Rest" + resultRest);


        //Задание 3*-1:
        //Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro
        double productA = 1000;
        double productB = 500;
        int diskount = 10;

        //Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        //Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
        double setAB = (productA + productB) - ((productA + productB) * diskount / 100);


        //Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
        System.out.println("SET A+B only " + setAB + " EURO");
        //Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
       System.out.println("Cheaper together! Discount: " + ((productA + productB) - setAB) + " EURO");

       //Задание 3*-2:
        //Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) )

        double thursday = 32;
        double friday = 28.5;
        double saturday = 24;
        double sunday = 18.7;
        double monday = 15.6;
        double tuesday = 12;
        double wednesday = 10;
        double summTemperatur = thursday + friday + saturday + sunday + monday + tuesday + wednesday;
        double wiefiele = 7;
        double rundeaverage1 = summTemperatur / wiefiele;
        System.out.println("mittemp: " + rundeaverage1);
        double rundeaverage = Math.round((summTemperatur / wiefiele) * 100.0) / 100.0;
        System.out.println("average temperature: " + rundeaverage);






        // Задание 4:
        //При делении на 2 в остатке может быть "1"
        //При делении на 3 в остатке может быть "1 или 2"




    }
}



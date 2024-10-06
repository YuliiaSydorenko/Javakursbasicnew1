package lesson16;

import lesson15.Cat;

public class Lesson16 {
    public static void main(String[] args) {


        Cat catVar = new Cat();
        catVar.whoAmI();
        System.out.println(catVar.name);
        catVar.name = "Jack";
        System.out.println(catVar.name);

        Cat barsik = new Cat("Barsik", "grey", 3);
        barsik.whoAmI();
        System.out.println("Имя " + barsik.name);
        System.out.println("Цвет " + barsik.color);
        System.out.println("Возраст " + barsik.age);
        barsik.age = 12;

        Cat cat1 = new Cat("Barsik", "grey", 3);
        cat1.whoAmI();
        Cat catClone = cat1;
        cat1.whoAmI();
         cat1.age = 100;
         cat1.whoAmI();
         catClone.whoAmI();
        System.out.println(catClone.age);
        catClone.name = "Max";
        catClone.whoAmI();
        catClone = new Cat("Kratos", "black", 99);
        catClone.whoAmI();

        catClone = null;
        if (catClone !=null) {
            System.out.println(catClone.name);
            catClone.whoAmI();

        }






    }
}

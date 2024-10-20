package homeworksss.homework20.Cats;

public class CatApp {
    public static void main(String[] args) {
        Cat genericCat = new Cat("Musia", 3);
        Pupi pupiCat = new Pupi("Pupi", 2, "Ball");
        Pusi pusiCat = new Pusi("Pusi", 2, "Black");

        System.out.println(genericCat.toString());
        genericCat.makeSound();

        System.out.println(pupiCat.toString());
        pupiCat.makeSound();

        System.out.println(pusiCat.toString());
        pusiCat.makeSound();
    }
    }


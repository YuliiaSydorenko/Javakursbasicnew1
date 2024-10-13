package homework22.human;

public class Main {
    public static void main(String[] args) {


        Man man = new Man();
        Amateur amateur = new Amateur();
        Professional professional = new Professional();
        System.out.println("Man: ");
        man.run();
        System.out.println("Amateur:");
        amateur.run();
        System.out.println("Professional: ");

    }
}

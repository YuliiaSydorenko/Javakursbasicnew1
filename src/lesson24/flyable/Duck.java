package lesson24.flyable;

public class Duck implements Flyable, Swimmable {

    @Override
    public void fly(){
        System.out.println("Dyck flight");
    }
    @Override
    public void swim(){
        System.out.println("Duck swim");
    }

}


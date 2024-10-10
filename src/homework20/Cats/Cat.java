package homework20.Cats;

public class Cat {
    protected String name;
    protected int age;



    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public String toString() {
        return "Cat: " + name + ", Age: " + age ;
    }

    // Пример метода, который могут переопределить наследники
    public void makeSound() {
        System.out.println("Meow!");
        System.out.println("Jump");
    }
}

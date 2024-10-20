package homeworksss.homework20.Cats;

public class Pupi extends Cat {
    private String favoriteToy;

    public Pupi(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    // Переопределение метода toString для добавления дополнительной информации
    @Override
    public String toString() {
        return "Pupi: " + name + ", Age: " + age + ", Favorite Toy: " + favoriteToy;
    }

    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println("Purr... Purr!");
    }


}

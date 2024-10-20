package homeworksss.homework20.Cats;

public class Pusi extends Cat{
    private String furColor;

    public Pusi(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    // Переопределение метода toString для добавления цвета шерсти
    @Override
    public String toString() {
        return "Pusi: " + name + ", Age: " + age + ", Fur Color: " + furColor;
    }

    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println("Mew... Mew!");
    }

}

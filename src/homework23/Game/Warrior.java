package homework23.Game;

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    // Реализация метода атаки для воина (меч)
    @Override
    public void attack() {
        System.out.println(name + " attacks with a sword!");
    }
}

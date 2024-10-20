package homeworksss.homework23.Game;

class Archer extends GameCharacter {
    public Archer(String name) {
        super(name);
    }

    // Реализация метода атаки для лучника (стрелы)
    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow!");
    }
}

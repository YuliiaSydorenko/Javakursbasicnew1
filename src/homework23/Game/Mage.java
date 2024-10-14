package homework23.Game;

class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }

    // Реализация метода атаки для мага (магическое заклинание)
    @Override
    public void attack() {
        System.out.println(name + "attackt with spell Ahalai-mahalai, liaski-masiaski!");
    }
}

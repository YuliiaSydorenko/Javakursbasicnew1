package homework23.Game;

public class GameApp {
    public static void main(String[] args) {
        Mage mage = new Mage("Merlin ");
        mage.attack();

        Warrior warrior = new Warrior("Glen");
        warrior.attack();

        Archer archer = new Archer("Beleg");
        archer.attack();

    }

    }




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
/*
        GameCharacter[] characters = new GameCharacter[3];

        characters[0] = new Warrior("Glen");
        characters[1] = new Mage("Merlin");
        characters[2] = new Archer("Beleg");

        for (GameCharacter character : characters){

 */



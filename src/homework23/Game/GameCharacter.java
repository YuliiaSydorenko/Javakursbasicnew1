package homework23.Game;


abstract class GameCharacter {
    protected String name;


    public GameCharacter(String name) {
        this.name = name;
    }
    public abstract void attack();


}

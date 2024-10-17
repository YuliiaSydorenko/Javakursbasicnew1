package homework24.triatlon;

public class Triathlete implements Swimmer, Runner{

String name;

    public Triathlete(String name) {
        this.name = name;
    }

    public Triathlete() {

    }

    @Override
    public void run(){
        System.out.println("Triathlete run");

    }
    @Override
    public void swim(){
        System.out.println("Triathlete swim");
    }

}

package homework24.triatlon;

public class Triathlete implements Swimmer, Runner{
    @Override
    public void run(){
        System.out.println("Triathlete run");

    }
    @Override
    public void swim(){
        System.out.println("Triathlete swim");
    }

}

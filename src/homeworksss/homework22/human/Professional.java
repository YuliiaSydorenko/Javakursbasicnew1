package homeworksss.homework22.human;

// профи бежит со скоростью 25 км,
//отдых после пробежки 5 минут.

public class Professional extends Man {
    @Override
    public void run(){
        System.out.println("Running with speed: 25 km/h");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("Rest needed: 5 minutes");
    }
}



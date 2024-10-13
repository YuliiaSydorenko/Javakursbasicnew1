package homework22.human;

public class Professional extends Man {
    @Override
    public void run(){
        System.out.println("Running with speed: 25 km/h");
        rest();
    }

    // Переопределяем метод отдыха
    @Override
    public void rest() {
        System.out.println("Rest needed: 5 minutes");
    }

    }



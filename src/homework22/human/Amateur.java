package homework22.human;

class Amateur extends Man{
    @Override
    public void run(){
        System.out.println("Running with speed: 15 km/h");
        rest();
    }


    @Override
    public void rest() {
        System.out.println("Rest needed: 10 minutes");
    }
}

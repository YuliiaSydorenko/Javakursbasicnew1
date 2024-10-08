package lesson_18;

public class Car {
    public static int totalCarProduced;
    public static int numbersOfR;


    private  String model;
    private int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;

        totalCarProduced++;
        numbersOfR = 4;

    }
    public String toString(){
        return String.format("Auto - model: %s, power: %d" + " Всего выпущено машин: %d" + "  Колес у авто: %d", model, powerPS, totalCarProduced, numbersOfR);
    }
    public static void testStatic(){
        System.out.println("Hello from static method");

    }

    public int getPowerPS() {
        return powerPS;
    }
    public void setPowerPS(int powerPS){
        this.powerPS = powerPS;
    }
}

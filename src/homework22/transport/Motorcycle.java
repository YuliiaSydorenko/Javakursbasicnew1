package homework22.transport;
//Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).
//

public class Motorcycle extends Vehicle {
    @Override
    public void startEngine(){
        System.out.println("Motorcycle engine start");

    }

}

package homework22.transport;

//Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.

public class TransportApp {


    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        for (Vehicle vehicle : vehicles){
            vehicle.startEngine();

        }
    }
}

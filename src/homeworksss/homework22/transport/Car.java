package homeworksss.homework22.transport;
//Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).
//

public class Car extends Vehicle{
    @Override

    public void startEngine(){
        System.out.println("Car start engine ");
    }

}

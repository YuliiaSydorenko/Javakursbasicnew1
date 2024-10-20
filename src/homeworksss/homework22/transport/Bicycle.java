package homeworksss.homework22.transport;
//Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).
//

public class Bicycle extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Bicycle has no engine to start");
    }
}

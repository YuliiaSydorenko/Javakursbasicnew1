package lessonssssss.lesson18;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("staticVar" + Car.totalCarProduced);

        Car car = new Car("BMW", 200);
        System.out.println(car.toString());

        Car car2 = new Car("Opel", 100);
        System.out.println(car2.toString());


       // System.out.println(car.toString());
        System.out.println("staticVar" + Car.totalCarProduced);

        Car.testStatic();
        
        int sum = MathUtils.intsumOfInts(25, 10);
        System.out.println("sum: " + sum);
        


    }
}

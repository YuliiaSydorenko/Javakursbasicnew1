package lesson20.transport;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus-X1", 10,40);
        System.out.println(bus.toString());

        bus.start();
        bus.stop();
        System.out.println("bus.getModel: " + bus.getModel());
        System.out.println("bus.getCapacity" + bus.getCapacity());

        System.out.println(("====================================="));

        Train train  = new Train("Skoda", 2022, 4, 40);
        System.out.println(train.toString());
        train.start();


        System.out.println("Train Model:" + train.getModel() );
        System.out.println("train.getCapacity  " + train.getCapacity());
        train.setCountWagons(3);
        System.out.println("train.getCapacity1  " + train.getCapacity());
        System.out.println("============================================");

        Bus bus1 = new Bus("Bus-X2", 2024,3);
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());
        System.out.println("============================================");


        System.out.println(bus1.dropPassenger());
        System.out.println(bus1.dropPassenger());
        System.out.println(bus1.dropPassenger());
        System.out.println(bus1.dropPassenger());
















    }
}

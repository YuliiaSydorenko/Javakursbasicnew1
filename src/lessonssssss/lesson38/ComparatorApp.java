package lessonssssss.lesson38;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    private static Car[] car;

    public static void main(String[] args) {


        int[] numbers = {9, 5, 1, 2, 3, 0, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"Abbb", "ccc", "apple", "Zebra"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


        Car[] cars = new Car[5];

        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2020, 190);
        cars[2] = new Car("Citroen", 2018, 120);
        cars[3] = new Car("WV", 2021, 250);
        cars[4] = new Car("Ferrari", 2024, 300);


        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        System.out.println("========================");
        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Arrays.sort(cars, carSpeedComparator);
        System.out.println(Arrays.toString(cars));


        CarModelComparator carModelComparator = new CarModelComparator();
        Arrays.sort(cars, carModelComparator);
        System.out.println(Arrays.toString(cars));

        System.out.println("-------------------");

        Arrays.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });


        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {

                //"c1.getYear() - c2.getYear()" - год в порядке возрастания
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare == 0) {


                    //"c2.getModel().compareTo(c1.getModel()" - модель в порядке убывания

                    return c2.getModel().compareTo(c1.getModel());
                } else {
                    return yearCompare;
                }
            }
        });

        System.out.println(Arrays.toString(cars));

        //Functional interface

        System.out.println("----------------------------");

        Arrays.sort(cars, (car1, car2) -> car1.getSpeed() - car2.getSpeed());

        /* KOPY:  @Override
        здесь метод в одну строку кода
    public int compare(Car car1, Car car2){
      return car2.getSpeed() - car1.getSpeed();
      */
        System.out.println(Arrays.toString(cars));


        System.out.println("+++++++++++++++++++++++++++++++++++");
        // @Override
        //            двойной метод, где - год в порядке возрастания, а модель в порядке убывания
        //            public int compare(Car c1, Car c2) {
        //              int yearCompare = c1.getYear() - c2.getYear();
        //                if (yearCompare == 0) {
        //                    return c2.getModel().compareTo(c1.getModel());
        //                } else {
        //                    return yearCompare;

        Arrays.sort(cars, (car1, car2) -> {
            return car1.getSpeed() - car2.getSpeed();
        });

        Arrays.sort(cars, (c1, c2) -> {
            //двойной метод, где - год в порядке возрастания, а модель в порядке убывания
            int yearCompare = c1.getYear() - c2.getYear();
            if (yearCompare == 0) {
                return c2.getModel().compareTo(c1.getModel());
            } else {
                return yearCompare;
            }
        });

       /* Arrays.sort(cars, (c1, c2) -> {
            Integer yearCompare = c1.getYear() - c2.getYear();
            yearCompare = Integer.compare(yearCompare, c2.getYear());

            if (yearCompare == 0) {
                return c1.getSpeed() - c2.getSpeed();
            } else {
                return yearCompare;
            }

        });*/

        System.out.println("+_+_+_+_+_+_+_+_");
// сортировка по году и скорости в прямом порядке
        Comparator<Car> comparator = (c1, c2) -> {
            int yearCompare = Integer.compare(c1.getYear(), c2.getYear());
            if (yearCompare == 0) {
                return Integer.compare(c1.getSpeed(), c2.getSpeed());
            }
            return yearCompare;
        };

        Arrays.sort(cars, comparator);
        System.out.println(Arrays.toString(cars));



        // сортировка по году в обратном порядке
        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());
        System.out.println(Arrays.toString(cars));

        // сортировка по году в прямом порядке
        Arrays.sort(cars, (car1, car2) -> car1.getYear() - car2.getYear());
        System.out.println(Arrays.toString(cars));

        // сортировка по скорости в прямом порядке
        Arrays.sort(cars, (car1, car2) -> car1.getSpeed() - car2.getSpeed());
        System.out.println(Arrays.toString(cars));

        // сортировка по скорости в  обратном порядке
        Arrays.sort(cars, (car1, car2) -> car2.getSpeed() - car1.getSpeed());
        System.out.println(Arrays.toString(cars));
        System.out.println("___=___+___+___+___");

        // сортировка по году в прямом порядке
        Arrays.sort(cars, Comparator.comparing(Car::getYear));
        System.out.println(Arrays.toString(cars));

        // сортировка по году в обратном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed());
        System.out.println(Arrays.toString(cars));

        // сортировка по году и скорости в прямом порядке
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getSpeed));
        System.out.println(Arrays.toString(cars));


    }

}

package lesson26;
import lists.MyArrayList;



public class ArrayTesting {
    public static void main(String[] args) {

        MyArrayList<Integer> numbers = new MyArrayList<>();

        MyArrayList<Double> doubles = new MyArrayList<>();


        numbers.add("Python");

        System.out.println(numbers);

        System.out.println(numbers.indexOf(4));

        System.out.println(numbers.remove(5));
        System.out.println(numbers);

        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("Java");
        strings.add("Python");
        System.out.println(strings);

        System.out.println(strings.remove("Basic"));
        System.out.println(strings.remove("Scala"));
        System.out.println(strings);
    }

}

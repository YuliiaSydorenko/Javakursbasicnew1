package lessonssssss.lesson26;

import lists.MyArrayList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class ArrayTesting {
    public static void main(String[] args) {

        MyArrayList<Integer> numbers = new MyArrayList<>();

        MyArrayList<Double> doubles = new MyArrayList<>();


        numbers.add(1);

        System.out.println(numbers);

        System.out.println(numbers.indexOf(4));


        System.out.println(numbers);

        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("Java");


        // , "JS", "Scala", "Kotlin"     "JS", "Scala", "Kotlin"
        strings.add("Python");
        System.out.println(strings);


        System.out.println(strings);
    }
}

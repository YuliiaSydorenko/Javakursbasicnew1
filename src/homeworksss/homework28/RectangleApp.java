package homeworksss.homework28;

import lessonssssss.lesson28.equals.Employee;
import lists.MyArrayList;
import lists.MyList;

import java.util.ArrayList;
import java.util.List;

public class RectangleApp {
    public static void main(String[] args) {
        MyList<Rectangle> rectangleMyList = new MyArrayList<>();
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(4.0, 2.0);


        System.out.println("rectangle == rectangle1: " + rectangle.equals(rectangle1));
        System.out.println("rectangle == rectangle2: " + rectangle.equals(rectangle2));
        System.out.println("rectangle2 == rectangle1: " + rectangle2.equals(rectangle1));


       /* List<Rectangle> rectangleList = new ArrayList<>(List.of(rectangle, rectangle1, rectangle2));

        System.out.println("Список до удаления дубликатов:");
        rectangleList.forEach(System.out::println);
        boolean rect = false;
        System.out.println(rect);

        // Удаляем все прямоугольники, равные rectangle
        removeMatchingRectangles(rectangleList, rectangle);

        System.out.println("\nСписок после удаления дубликатов:");
        rectangleList.forEach(System.out::println);
        System.out.println(rect);


    }

    private static void removeMatchingRectangles(List<Rectangle> rectangleList, Rectangle rectangle) {
    }
*/

    }
}


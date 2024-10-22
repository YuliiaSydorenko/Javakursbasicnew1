package homeworksss.homework28;

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

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        // Выводим список до удаления дубликатов
        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        // Создаем объект Rectangle, который нужно удалить (все дубликаты)
        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);

        // Выводим список после удаления дубликатов
        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
    }
}





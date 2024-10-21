package homeworksss.homework28;

import lessonssssss.lesson28.equals.Employee;
import lists.MyArrayList;
import lists.MyList;

public class RectangleApp {
    public static void main(String[] args) {
        MyList<Rectangle> rectangleMyList = new MyArrayList<>();
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(4.0, 2.0);


        System.out.println("rectangle == rectangle1: " + rectangle.equals(rectangle1));

        System.out.println("rectangle == rectangle2: " + rectangle.equals(rectangle2));

        System.out.println("rectangle2 == rectangle1: " + rectangle2.equals(rectangle1));


    }

}

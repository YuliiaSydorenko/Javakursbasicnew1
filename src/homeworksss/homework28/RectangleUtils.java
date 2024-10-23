package homeworksss.homework28;

import java.util.Iterator;
import java.util.List;

public class RectangleUtils {


    public static void removeDuplicates(List<Rectangle> rectangles, Rectangle rectangleToRemove) {
        // Используем Iterator для безопасного удаления элементов во время итерации
        Iterator<Rectangle> iterator = rectangles.iterator();
        while (iterator.hasNext()) {
            Rectangle rectangle = iterator.next();
            if (rectangle.equals(rectangleToRemove)) {
                iterator.remove(); // Удаляем дубликат
            }
        }
    }
}

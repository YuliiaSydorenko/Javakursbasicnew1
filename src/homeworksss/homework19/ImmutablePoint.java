package homeworksss.homework19;

public class ImmutablePoint {
    // Объявляем поля x и y как final
    private int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    // Попробуем создать методы-сеттеры
    public  void setX(int x){
        this.x = x;
        // Ошибка: Невозможно присвоить значение final полю
    }
    public  void setY(int y){
        this.x = y;
        // Ошибка: Невозможно присвоить значение final полю
    }


    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(5, 10);
        System.out.println("x: " + point.getX() + ", y: " + point.getY());

        // Попытка изменить значение через сеттер вызовет ошибку компиляции

    }
}

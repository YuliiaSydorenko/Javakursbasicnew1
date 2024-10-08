package lesson_18;

public class Test {

    int x;
    static int staticY;

    public void testNonStatic(){

        x++;
        staticY++;
        testStatic();

    }
    public static void testStatic(){

        //x++; - нет доступа к нестатическому полю.

        staticY++;
        // может вызвать ТОЛЬКО статический метод;

    }

    public static void main(String[] args) {
        testStatic();
        //не могу вызвать НЕ статический метод!
        Test test = new Test();
        test.testNonStatic();



    }

}

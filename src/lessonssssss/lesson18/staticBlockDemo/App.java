package lessonssssss.lesson18.staticBlockDemo;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("counter: " + InitExample.counter);
        System.out.println(Arrays.toString(InitExample.colors));


        InitExample initObject = new InitExample();
        System.out.println(initObject.toString());

        System.out.println("==========Second==========");

        InitExample initObjeckt2 = new InitExample();


    }
}

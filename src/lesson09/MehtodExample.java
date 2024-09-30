package lesson09;

public class MehtodExample {
    public static void main(String[] args) {

        //System.out.println("Hello");
        //System.out.println("Hello");
        //System.out.println("Hello");


        sayHallo();
        sayHallo();
        sayHallo();

        String string =  "Java";
       sauSomething("Java");

       char ch = 'A';
       char anotherChar = 'B';

        printDecimalCodeChar(ch);
        printDecimalCodeChar(anotherChar);
        printDecimalCodeChar('J');


        System.out.println("==========PrintArray================\n");

      int[] array = {1, 34,56,7,34,3456,};
      printArray(array);
        int[] array2 = {1, 34,567, 56,7,34,3456,};
        printArray(array2);

        array[0] = -1000000;
        array[3] = 101010101;

        printArray(array);

        System.out.println("========Перегрузка============/n");


        // Перегрузка методов
         /*
        В пределах одного класса может существовать два и более метода с одинаковым именем,
        но разным набором параметров (перегрузка методов)

        Сигнатура метода - совокупность названия и набора параметров (порядок передачи параметров имеет значение).
         */
        //  написать метод, который выводит на экран числа от 1 до N
        printNumbers(10);
        // Написать метод, который выводит н экран числа X до Y
        printNumbers(5, 10);
        printNumbers("Java", 1);
        printNumbers(2, "Python");



    } //END MAIN!!!!!   Method AREA

    public static void printNumbers(int x, String str) {
        System.out.println("Method opt 1: " + str);
    }

    public static void printNumbers(String str, int x) {
        System.out.println("Method opt 2: " + str);
    }

    public static void printNumbers (int x, int y){
        int i = x;
        while (i <= y){
            System.out.println(i ++ +",");
        }
        System.out.println();

    }
    public static void printNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i++ + ", ");
        }
        System.out.println();
    }
    public static void printArray(int[] array){
        System.out.println("[");
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
            i++;
        }
    }

    public static void printDecimalCodeChar(char ch1){
        System.out.println((int) ch1);
    }

    public static void sauSomething(String text){
        System.out.println(text);
    }
    public static void sayHallo () {
        System.out.println("Hallo");
    }

} //End Class


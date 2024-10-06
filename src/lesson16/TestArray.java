package lesson16;

public class TestArray {
    public static void main(String[] args) {

        MagicArray  magicArray = new  MagicArray();
        System.out.println(magicArray.toString());

        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(300);
        System.out.println("Сейчас в массиве элементов: " + magicArray );
        magicArray.add(500, 600, 750, 789, 5678, 780, 800, 700, 1000);


        System.out.println(magicArray.toString());
    }
}

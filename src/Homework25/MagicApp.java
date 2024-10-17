package Homework25;

    public class MagicApp {
        public static void main(String[] args) {

            int[] test = {0, 1, 2, 3, 4, 5, 6, 7};

            Homework25.MagicArrayGen magicArray = new Homework25.MagicArrayGen();







            magicArray.add(1, 2, 3, 4, 5, 6, 7, 8, 9);

            System.out.println(magicArray.toString());

            int index = magicArray.indexOf(100);
            System.out.println("Индекс элемента: " + index);

            magicArray.remove(3);
            magicArray.add(1555);
            System.out.println(magicArray.toString());

            System.out.println("\n======= Remove By Value ========= \n");

            boolean isDeleted = magicArray.removeByValue(7);
            System.out.println("isDeleted: " + isDeleted);
            System.out.println(magicArray.toString());

            isDeleted = magicArray.removeByValue(10000000);
            System.out.println("isDeleted: " + isDeleted);
            System.out.println(magicArray.toString());


        }

        private static class MagicArrayGen {
        }
    }



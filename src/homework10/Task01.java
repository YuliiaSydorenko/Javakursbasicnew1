package homework10;

public class Task01 {


        //
        //Task 1
        //Написать метод со следующим функционалом:
        //На вход метод принимает массив целых чисел и число
        // - длину нового массива.
        // Метод должен создать и распечатать массив заданной в параметрах длинны.
        // В начало массива должны быть скопированы элементы из входящего массива:
        //
        // {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

        //{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}

        //Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
        //int[] numbers = {1, 2, 3, 4, 5};
        //int arrayLength = numbers.length;


        public static int[] copyOfArray(int[] inputArray, int newLength) {
            int[] newArray = new int[newLength];

            for (int i = 0; i < newArray.length; i++) {
                if (i < inputArray.length) {
                    newArray[i] = inputArray[i];
                } else {
                    newArray[i] = 0;
                }
            }
            return newArray;
        }
        public static void main(String[] args) {
            int[] numbers = {0, 1, 2, 3, 4, 5, 6};

            int[] newArray1 = copyOfArray(numbers, 3);
            System.out.print("copyOfArray(numbers, 3) -> ");
            printArray(newArray1);

            int[] newArray2 = copyOfArray(numbers, 5);
            System.out.print("copyOfArray(numbers, 5) -> ");
            printArray(newArray2);
        }

        public static void printArray(int[] array) {
            System.out.print("{");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }




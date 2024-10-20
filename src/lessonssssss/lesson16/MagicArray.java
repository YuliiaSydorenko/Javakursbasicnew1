package lessonssssss.lesson16;

public class MagicArray {
    int[] array;
    int cursor; // " = 0 "

    public MagicArray() {
        array = new int[10];

    }

    //Добавление в массив одного элемента
    void add(int value) {
        //Проверка, есть ли свободное место во внутреннем массиве.
        // Если места нет, нужно его добавить.
        if (cursor == array.length - 1) {
            expandArrey();
            //нужно расширить массив перед добавлением нового элемента
        }
        array[cursor] = value;
        cursor++;
    }

    void add(int... numbers) {
        //с намберс можно обращаться, как со ссылкой на массив int.
        // System.out.println("Приняли несколько интовю А именно: " +numbers.length);
        // System.out.println("Есть индекс у каждого инта, как в массиве. " +  numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }

    //Динамическое расширение массива
    void expandArrey() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        // 1. создать новый массив бОльшего размера.
        // 2. Переписать все данные из старого массива до курсора.
        // 3. Перебросить ссылку
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        //Перебрасываем ссылку на новый массив
        array = newArray;
        //Расширение массива завершено
        System.out.println("Расширение массива завершено");


    }
    // 3. Возвращать строковое представление массива.
    // [1, 14, 16]


    public String toString() {
        if (cursor == 0) return "[}";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]");
        }
        return result;
    }

    //Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE;


    }
}


    // Удаление элемента по индексу
    //int remove(int index)


        //1. Проверка индекса на валидность.
        // 2. Удалить значение по индексу.
        // 3. Передвинуть курсор, т.к. кол-во элементов уменьшилось.
        // 4. Вернуть старое значение









// 1. Хочу добалять в массив элементы( не думая об индексах), сделать его "резиновым".
// 2. Динамическое изменение размера массива.
// 3. Возвращать строковое представление массива.
// 4. Добавляем в массив сразу несколько значений.
// 5. Текущее количество элементов в массиве.
// 6. Возвращает значение по индексу.
// 7. Удаляет элемент по индексу из массива(вернуть старое значение)


package lessonssssss.lesson29.Person;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



class TestExample1 {

    // Метод, который выполняется перед КАЖДЫМ тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");
    }
    /*
    @BeforeAll - метод выполняется только один раз перед выполнение первого теста
    @AfterEach - выполняется после КАЖДОГО тестовым методом
    @AfterAll - метод выполняется только один раз после выполнение всех тестовых матодов
    @Disabled - указывает, что тест отключен и выполняться не будет
    @Nested - позволяет создать вложенный тестовый класс. Может быть использована для логический группировки тестовых методов
     */


    // Указывает, что метод является тестовым. Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов
    @Test
    public void testAddition() {
        System.out.println("Test Addition");
        int result = 2 + 2;

        // Ожидаемое значение 4.
        // Реальное значение в переменой result

        // Методы проверки утверждений
        // assertEquals(expected, actual) - проверяет, равны ли два значения
        Assertions.assertEquals(4, result); // проверяет равны ли два значения
        Assertions.assertNotEquals(5, result); // тест будет пройден если "неожидаемый результат" не совпадает с фактическим
        Assertions.assertTrue(result >= 4); // проверяет, что условие верно (условие возвращает true)
        Assertions.assertFalse(result > 4); // проверяет, что условие ложно (условие возвращает false)
        Assertions.assertNull(null); // Проверяет, что объект равен null
        Assertions.assertNotNull("String"); // Проверяет, что объект не равен null
    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
        // Пустой тестовый метод считается пройденным.
        // Если в методе нет ложного утверждения
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruits(String fruit) {
        System.out.println(fruit);
        Assertions.assertTrue(fruit.length() > 2);
    }


}
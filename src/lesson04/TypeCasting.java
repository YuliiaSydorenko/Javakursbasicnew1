package lesson04;
// ПРЕОБРАЗОВАНИЕ  ТИПОВ _ из большего в меньший

public class TypeCasting {
    public static void main(String[] args) {
        byte byteVal = 123;
        int intVal;
        intVal = byteVal;
        System.out.println("intVal: " + intVal);
        double doubleVal = intVal;
        System.out.println(" dobleValue: " + doubleVal);

        double dobleVal = 42.1;
        // int int1 = dobleVal; так вообще то нельзя!,  т.к. может привести к потере данных, но можно, если подтвердить, что осознаешю, что будет потеря точности.

        int int1 = (int) dobleVal;
        System.out.println("doubleVal: " + dobleVal);
        System.out.println("int1: " + int1);

        System.out.println("====================================");
int x = 20;
int y = 7;
//TODO;

        double result;
        double result1;
result = x / y;
        System.out.println("result:" + result);
        result1 = x / 7.0;
        System.out.println("result1:" + result);
        result = (float) x / y;
        System.out.println(" Result float coast:" + result);

result = x / (double) y;
        System.out.println(" resdobcast:" + result);

    }
}

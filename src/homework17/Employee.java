package homework17;

public class Employee {
    //Task 0
    //Написать класс Employee (Работник)
    //У него должны быть поля имя, возраст, зарплата
    //Инкапсулировать класс
    //Написать метод info() выводящий информацию о работнике.
    //Task 1
    //Инкапсулировать класс нашего магического массива


    // Поля класса (инкапсулируем их, сделав приватными)
   private String name;
   private int age;
   private double salary;


    // Конструктор для инициализации полей
    public Employee(String name, int age, double salary){

        this.name = name;
        this.age = age;
        this.salary = salary;
    }



    public String toString() {
        return String.format("Employee %s, Age: %d, Salary: %s", name, age, salary);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(String hobby) {
        this.salary = salary;
    }

    public void info() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);


    }
}





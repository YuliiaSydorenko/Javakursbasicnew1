package homeworksss.homework22.human;

//В методе бежать - вызвать метод,
// который будет выводить количество минут,
// необходимых для отдыха спортсменам

public class Main {
    public static void main(String[] args) {


        Man man = new Man();
        Amateur amateur = new Amateur();
        Professional professional = new Professional();




        System.out.println("Man: ");
        man.rest();
        System.out.println("Amateur:");
        amateur.rest();
        System.out.println("Professional: ");
        professional.rest();

    }
}

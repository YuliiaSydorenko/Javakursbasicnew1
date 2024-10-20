package homeworksss.homework22.human;

//Task 1
//Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
//
//У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
//
//Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5

public class Man {
    public void run() {
        System.out.println("Running with speed: 10 km/h");
        rest();
    }

    public void rest() {
        System.out.println("Rest needed: 15 minutes");
    }
}

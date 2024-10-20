package lessonssssss.lesson16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;

    }
    String info(){
        return "I am dog" + name + " , my weight is " + weight; }

        void  eat(){
            System.out.println("Я ем");
            weight++;
        }

        void  run(){
        while (weight <5) {
            System.out.println("Сорян, я слишком худая и голодная, бежать не могу!");
            System.out.println("Надо поесть, мой вес сейчас:" + weight);

            eat();
        }
            System.out.println("Я бегу!");
            weight -=2;
            System.out.println("Вес после пробежки: " + weight);
        }


}

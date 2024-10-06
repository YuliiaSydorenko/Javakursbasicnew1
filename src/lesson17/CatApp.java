package lesson17;

public class CatApp {
    public static void main(String[] args) {
        Cat17 cat = new Cat17(" Catty", 8, 5);
        cat.sayMeow();
        System.out.print(cat.toString());



        //cat.age = -1000;
       //cat.weight = 1500;
       // cat.name = null;


        System.out.println(cat.toString());



        //21
        String name = cat.getName();
        //24
        int age = cat.getAge();
        //26
        int weight = cat.getWeight();

    }


}

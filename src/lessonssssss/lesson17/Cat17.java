package lessonssssss.lesson17;

public class Cat17 {
    private String name;
    private int age;
    private int weight;
    public Cat17(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Cat17(){

    }
    void sayMeow(){
        System.out.println("Meow!" + name);
    }
    public String toString(){
        return "Cat" + name + "age:" + age + "Weight:" + weight;
    }
    public String getName(){
        return  name;
    }
    public int getAge(){
       return  age;
    }
    public int getWeight(){
        return   weight;
    }



}

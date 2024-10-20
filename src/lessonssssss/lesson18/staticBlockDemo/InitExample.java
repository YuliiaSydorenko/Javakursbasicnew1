package lessonssssss.lesson18.staticBlockDemo;

public class InitExample {
    static String[] colors;
    static int counter = 1;

    private String title = "Hello";
    private int capacity = 10;

    static {
        System.out.println("Static init blick run!");
        colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";
        counter = 10;

    }
    static {
        System.out.println("Second static inint block run!");
        counter = 100;
    }
    {
        System.out.println("Non-static init block run!");
        this.title = "Constructor";
    }



    public InitExample() {
        System.out.println("Construcktor run!");

        this.title = "Constructor";


    }
    public String toString(){
        return "title: " + title + " , capacity:" + capacity + " , static counter:" + counter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopacity() {
        return capacity;
    }

    public void setCopacity(int copacity) {
        this.capacity = copacity;
    }



}


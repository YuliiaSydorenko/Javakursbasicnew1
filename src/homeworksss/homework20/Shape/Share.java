package homeworksss.homework20.Shape;

public class Share {
    String name;
    String color;




    public Share (String name) {
        this.name = name;
        System.out.println("Shape: " + name);
    }

    public Share() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor(){
        return color;
    }

}
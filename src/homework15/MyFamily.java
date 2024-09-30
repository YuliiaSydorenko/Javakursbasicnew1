package homework15;
.idea/

import static java.lang.System.*;

public class MyFamily {
    public static void main(String[] args) {
        Child child = new Child();
        String childName = child.name;
        int childAge = child.age;
        String hsirColor = child.hairColor;
        String gender = child.gender;


        Child child1 = new Child("Vlada");
        child1.hairColor = ("Blond");
        child1.age = 27;
        child1.gender = ("Girl");

        Child child2 = new Child("Lev");
        child2.hairColor = ("Blond");
        child2.age = 15;
        child2.gender = ("Boy");

        Child child3 = new Child("Sofiia");
        child3.hairColor = ("Brown");
        child3.age = 13;
        child3.gender = ("Girl");


        out.println("Name: " +child1.name);
        out.println("HairColor: " + child1.hairColor);
        out.println("Age: " +child1.age);
        out.println("Gender: " + child1.gender);

        out.println("Name: " +child2.name);
        out.println("HairColor: " + child2.hairColor);
        out.println("Age: " +child2.age);
        out.println("Gender: " + child2.gender);

        out.println("Name: " +child3.name);
        out.println("HairColor: " + child3.hairColor);
        out.println("Age: " +child3.age);
        out.println("Gender: " + child3.gender);

    }


}

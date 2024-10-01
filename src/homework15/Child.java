package homework15;


public class Child {
    String name;
    String hairColor;
    int age;
    String gender;

    public Child(String childName) {
    }

    public Child() {

    }

    public void Child(String childName) {
        name = childName;
        }
        public void Child(){
        }
        public void Child(String childName, String hairColor, int age, String gender){
        name = childName;
        this.hairColor = hairColor;
        this.age = age;
        this.gender = gender;
        }

    public void whoAmI() {

        System.out.printf("Я  %s, мой возраст: %d, я %s, я %s \n", this.name, age, hairColor);
    }
}

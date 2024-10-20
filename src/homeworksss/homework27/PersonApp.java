package homeworksss.homework27;

    public class PersonApp {
        public static void main(String[] args) {
            // Проверка корректного email и пароля

            try {
                homeworksss.homework27.Person person1 = new homeworksss.homework27.Person("example.email@domain.com", "Password1!");
                System.out.println("Person 1: Email and password are valid.");
            } catch (IllegalArgumentException e) {
                System.out.println("Person 1: " + e.getMessage());
            }

            // Пример некорректного пароля (нет специального символа)
            try {
                homeworksss.homework27.Person person2 = new homeworksss.homework27.Person("example.email@domain.com", "Password1");
                System.out.println("Person 2: Email and password are valid.");
            } catch (IllegalArgumentException e) {
                System.out.println("Person 2: " + e.getMessage());
            }

            // Пример некорректного email (меньше двух символов после точки)
            try {
                homeworksss.homework27.Person person3 = new homeworksss.homework27.Person("example@domain.c", "Password1!");
                System.out.println("Person 3: Email and password are valid.");
            } catch (IllegalArgumentException e) {
                System.out.println("Person 3: " + e.getMessage());
            }

            // Пример некорректного пароля (нет цифры)
            try {
                homeworksss.homework27.Person person4 = new homeworksss.homework27.Person("example.email@domain.com", "Password!");
                System.out.println("Person 4: Email and password are valid.");
            } catch (IllegalArgumentException e) {
                System.out.println("Person 4: " + e.getMessage());
            }

            // Пример некорректного пароля (меньше 8 символов)
            try {
                homeworksss.homework27.Person person5 = new Person("example.email@domain.com", "P1!");
                System.out.println("Person 5: Email and password are valid.");
            } catch (IllegalArgumentException e) {
                System.out.println("Person 5: " + e.getMessage());
            }
        }
    }



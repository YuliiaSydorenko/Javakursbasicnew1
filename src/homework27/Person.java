package homework27;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password); // Проверка пароля при создании объекта
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password does not meet the required criteria");
        }
    }

    // Метод для проверки валидности email
    private boolean isEmailValid(String email) {
        // 1. Должна присутствовать @ и только одна
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3. После последней точки есть 2 или более символов
        if (email.length() - dotIndexAfterAt < 3) return false;

        // 4. Разрешенные символы (буквы, цифры, '-', '_', '.', '@')
        for (char c : email.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '-' || c == '_' || c == '.' || c == '@')) {
                return false;
            }
        }

        // 5. До @ должен быть хотя бы 1 символ
        String localPart = email.substring(0, indexAt);
        if (localPart.length() == 0) return false;

        // 6. Первый символ должен быть буквой
        if (!Character.isLetter(localPart.charAt(0))) return false;

        return true;
    }

    // Метод для проверки валидности пароля
    private boolean isPasswordValid(String password) {
        // 1. Длина пароля >= 8 символов
        if (password.length() < 8) {
            return false;
        }

        // Флаги для проверки
        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        // Специальные символы для пароля
        String specialCharacters = "!%$@&*()[].,-";

        // Проходим по каждому символу пароля
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true; // 2. Минимум 1 цифра
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true; // 3. Минимум 1 маленькая буква
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true; // 4. Минимум 1 большая буква
            } else if (specialCharacters.indexOf(c) >= 0) {
                hasSpecialChar = true; // 5. Минимум 1 специальный символ
            }
        }

        // Пароль будет подходить только если все пять условий выполнены
        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
   /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */

/*
Требование к паролю:
длина >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква
Должна быть мин 1 большая буква
Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */


// Полезные методы класса Character
// Возвращает true если символ буква
//Character.isAlphabetic('c');
// Возвращает true если символ цифра
// Character.isDigit('1');
// Character.isLetter('3');
// Character.isLetterOrDigit('-');







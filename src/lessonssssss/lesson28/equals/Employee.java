package lessonssssss.lesson28.equals;

import java.util.Objects;

public class Employee {
    private String firstname;
    private String lastname;
    private String dateOfBirth;

    public Employee(String firstname, String lastname, String dateOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }
// сгенерирована проверка через конструктор
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstname, employee.firstname) && Objects.equals(lastname, employee.lastname) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, dateOfBirth);
    }
//  проверка создана вручную
/* @Override
    public boolean equals(Object obj) {
        if (this == (Employee) obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee employee = (Employee) obj;
        return Objects.equals(firstname, employee.firstname) &&
               Objects.equals(lastname, employee.lastname) &&
               Objects.equals(dateOfBirth, employee.dateOfBirth);
    }
*/


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

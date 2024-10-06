package homework17;

public class EmployeeApp {
    public static void main(String[] args) {


        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Bernd", 55, 2800);
        employees[1] = new Employee("Bruno", 61, 2500);
        employees[2] = new Employee("Alfred", 66, 2300);
        for (Employee employee : employees) {
            employee.info();
            System.out.println();

        }

    }
}

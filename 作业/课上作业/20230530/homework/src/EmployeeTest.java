import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 1000.0);
        Employee employee2 = new Employee("Mary", 1200.0);
        ArrayList<Employee> e1 = new ArrayList<Employee>();
        e1.add(employee1);
        e1.add(employee2);

        for (Employee employee : e1) {
            System.out.println(employee);
        }

        for (Employee employee : e1) {
            employee.setSalary(employee.getSalary() * 1000);
        }
        System.out.println("涨薪之后");
        for (Employee employee : e1) {
            System.out.println(employee);
        }

    }
}

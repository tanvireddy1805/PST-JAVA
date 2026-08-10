import java.util.*;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return name + " " + department + " " + salary;
    }
}

public class T12 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Tanvi", "CSE", 50000));
        employees.add(new Employee("Rahul", "ECE", 40000));
        employees.add(new Employee("Deepak", "IT", 60000));
        employees.add(new Employee("Anu", "CSE", 35000));

        employees.sort(
            Comparator.comparing(e -> e.department)
        );

        System.out.println("Employees sorted by Department Alphabetically:");

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

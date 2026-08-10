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

public class T13 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Tanvi", "CSE", 50000));
        employees.add(new Employee("Rahul", "ECE", 40000));
        employees.add(new Employee("Deepak", "IT", 60000));
        employees.add(new Employee("Anu", "CSE", 35000));
        employees.add(new Employee("Ravi", "ECE", 55000));

        employees.sort(
            Comparator.comparing((Employee e) -> e.department)
                      .thenComparing(
                          Comparator.comparingDouble((Employee e) -> e.salary)
                                    .reversed()
                      )
        );

        System.out.println("Department Alphabetically + Salary Descending:");

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

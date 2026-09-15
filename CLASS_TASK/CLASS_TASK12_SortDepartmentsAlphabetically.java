import java.util.Arrays;

public class CLASS_TASK12_SortDepartmentsAlphabetically {
    public static void main(String[] args) {
        String[] departments = {"Sales", "Marketing", "Engineering", "Finance", "Human Resources"};
        Arrays.sort(departments);

        System.out.println("Departments in alphabetical order:");
        for (String department : departments) {
            System.out.println(department);
        }
    }
}

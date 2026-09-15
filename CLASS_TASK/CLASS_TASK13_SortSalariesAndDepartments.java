import java.util.Arrays;

public class CLASS_TASK13_SortSalariesAndDepartments {
    public static void main(String[] args) {
        int[] salaries = {60000, 48000, 91000, 55000, 72000};
        String[] departments = {"Sales", "Marketing", "Engineering", "Finance", "Human Resources"};

        Arrays.sort(salaries);
        Arrays.sort(departments);

        System.out.println("Salaries in descending order:");
        for (int i = salaries.length - 1; i >= 0; i--) {
            System.out.println(salaries[i]);
        }

        System.out.println("\nDepartments in alphabetical order:");
        for (String department : departments) {
            System.out.println(department);
        }
    }
}

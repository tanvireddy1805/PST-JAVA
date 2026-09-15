import java.util.Arrays;

public class CLASS_TASK11_SortSalariesDescending {
    public static void main(String[] args) {
        int[] salaries = {60000, 48000, 91000, 55000, 72000};
        Arrays.sort(salaries);

        System.out.println("Salaries in descending order:");
        for (int i = salaries.length - 1; i >= 0; i--) {
            System.out.println(salaries[i]);
        }
    }
}

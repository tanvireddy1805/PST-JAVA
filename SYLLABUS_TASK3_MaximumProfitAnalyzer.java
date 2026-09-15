import java.util.*;

public class SYLLABUS_TASK3_MaximumProfitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int current = sc.nextInt();
        int maximum = current;

        for (int i = 1; i < n; i++) {
            int value = sc.nextInt();

            current = Math.max(value, current + value);
            maximum = Math.max(maximum, current);
        }

        System.out.println(maximum);
    }
}

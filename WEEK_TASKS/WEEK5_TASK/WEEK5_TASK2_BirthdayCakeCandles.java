import java.util.*;

public class WEEK5_TASK2_BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] chocolate = new int[n];

        for (int i = 0; i < n; i++) {
            chocolate[i] = sc.nextInt();
        }

        int day = sc.nextInt();
        int month = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= n - month; i++) {
            int sum = 0;

            for (int j = i; j < i + month; j++) {
                sum += chocolate[j];
            }

            if (sum == day) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}

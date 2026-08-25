import java.util.*;

public class TASK38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int maxCurrent = arr[0];
        int maxSum = arr[0];

        int minCurrent = arr[0];
        int minSum = arr[0];

        for (int i = 1; i < n; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
            maxSum = Math.max(maxSum, maxCurrent);

            minCurrent = Math.min(arr[i], minCurrent + arr[i]);
            minSum = Math.min(minSum, minCurrent);
        }

        if (maxSum < 0) {
            System.out.println(maxSum);
        } else {
            int circularSum = totalSum - minSum;
            System.out.println(Math.max(maxSum, circularSum));
        }

        sc.close();
    }
}

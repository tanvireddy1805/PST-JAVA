import java.util.*;

public class TASK37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSubarray = arr[0];
        int current = arr[0];

        int maxNonContiguous = 0;
        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maxSubarray = Math.max(maxSubarray, current);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                maxNonContiguous += arr[i];
            }

            largest = Math.max(largest, arr[i]);
        }

        if (maxNonContiguous == 0) {
            maxNonContiguous = largest;
        }

        System.out.println(maxSubarray + " " + maxNonContiguous);

        sc.close();
    }
}

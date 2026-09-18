import java.util.*;

public class WEEK2_TASK2_ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[2 * n];

        for (int i = 0; i < 2 * n; i++)
            nums[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
            System.out.print(nums[i + n] + " ");
        }
    }
}
import java.util.*;

public class WEEK2_TASK1_BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print(nums[nums[i]] + " ");
    }
}

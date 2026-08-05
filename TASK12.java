import java.util.Arrays;

public class TASK12 {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        TASK12 obj = new TASK12();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        System.out.println(Arrays.toString(obj.shuffle(nums, n)));
    }
}
import java.util.Arrays;

public class TASK11 {

    public int[] buildArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] += (nums[nums[i]] % n) * n;
        }

        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }

        return nums;
    }

    public static void main(String[] args) {
        TASK11 obj = new TASK11();

        int[] nums = {4, 0, 2, 1, 3};

        int[] result = obj.buildArray(nums);

        System.out.println(Arrays.toString(result));
    }
}
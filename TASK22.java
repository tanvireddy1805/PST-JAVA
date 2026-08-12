import java.util.Arrays;
import java.util.Scanner;

public class TASK22 {

    public static String largestNumber(int[] nums) {

        String[] numbers = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numbers[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

        if (numbers[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        for (String num : numbers) {
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Largest Number: " + largestNumber(nums));

        sc.close();
    }
}
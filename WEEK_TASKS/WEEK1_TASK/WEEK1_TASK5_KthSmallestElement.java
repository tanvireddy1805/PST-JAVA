import java.util.Arrays;
import java.util.Scanner;

public class WEEK1_TASK5_KthSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = input.nextInt();
        if (k <= 0 || k > size) {
            System.out.println("Invalid value of k");
        } else {
            Arrays.sort(numbers);
            System.out.println("The " + k + "th smallest element is: " + numbers[k - 1]);
        }
    }
}

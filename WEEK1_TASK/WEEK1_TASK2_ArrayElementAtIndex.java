import java.util.Scanner;

public class WEEK1_TASK2_ArrayElementAtIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the index: ");
        int index = input.nextInt();
        System.out.println("Element at index " + index + " is: " + numbers[index]);
    }
}

import java.util.Scanner;

public class WEEK1_TASK6_PrintArrayPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Possible pairs are:");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}

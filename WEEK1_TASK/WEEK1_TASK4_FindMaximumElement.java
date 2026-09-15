import java.util.Scanner;

public class WEEK1_TASK4_FindMaximumElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int maximum = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > maximum) maximum = numbers[i];
        }
        System.out.println("Maximum Element = " + maximum);
    }
}

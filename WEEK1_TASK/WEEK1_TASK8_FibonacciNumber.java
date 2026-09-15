import java.util.Scanner;

public class WEEK1_TASK8_FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position of the Fibonacci series: ");
        int position = input.nextInt();

        if (position <= 0) {
            System.out.println("Invalid input: n must be a positive integer");
            return;
        }

        int first = 0;
        int second = 1;
        for (int i = 3; i <= position; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println("Fibonacci number = " + (position == 1 ? first : second));
    }
}

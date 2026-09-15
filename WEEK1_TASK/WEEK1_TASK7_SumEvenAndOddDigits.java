import java.util.Scanner;

public class WEEK1_TASK7_SumEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Math.abs(input.nextInt());
        int evenSum = 0;
        int oddSum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) evenSum += digit;
            else oddSum += digit;
            number /= 10;
        }

        System.out.println("Even digits sum: " + evenSum);
        System.out.println("Odd digits sum: " + oddSum);
    }
}

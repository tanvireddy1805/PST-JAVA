import java.util.Scanner;

public class WEEK1_TASK10_SumOfLastDigits {
    static int sumOfLastDigits(int firstNumber, int secondNumber) {
        int firstLastDigit = Math.abs(firstNumber % 10);
        int secondLastDigit = Math.abs(secondNumber % 10);
        return firstLastDigit + secondLastDigit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Sum of the last digits: " + sumOfLastDigits(firstNumber, secondNumber));
    }
}

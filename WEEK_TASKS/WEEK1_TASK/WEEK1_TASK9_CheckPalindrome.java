import java.util.Scanner;

public class WEEK1_TASK9_CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int original = number;
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        System.out.println(original == reverse ? "Palindrome" : "Not Palindrome");
    }
}

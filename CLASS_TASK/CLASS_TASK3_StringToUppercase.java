import java.util.Scanner;

public class CLASS_TASK3_StringToUppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        System.out.println("Uppercase: " + text.toUpperCase());
    }
}

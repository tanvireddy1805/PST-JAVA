import java.time.LocalDate;
import java.util.Scanner;

public class TASK18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        int day = date.getDayOfYear();

        System.out.println("Day of the Year: " + day);

        sc.close();
    }
}
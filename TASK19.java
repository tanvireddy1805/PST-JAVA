import java.time.LocalDate;
import java.util.Scanner;

public class TASK19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        System.out.println("Day of the Week: " + date.getDayOfWeek());

        sc.close();
    }
}
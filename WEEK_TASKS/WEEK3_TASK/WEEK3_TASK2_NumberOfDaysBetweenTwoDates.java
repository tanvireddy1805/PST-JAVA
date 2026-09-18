import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WEEK3_TASK2_NumberOfDaysBetweenTwoDates {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2026, 9, 1);
        LocalDate endDate = LocalDate.of(2026, 9, 18);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Number of days between " + startDate + " and " + endDate + ": " + daysBetween);
    }
}

import java.time.LocalDate;

public class WEEK3_TASK4_DayOfTheWeek {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 9, 18);

        System.out.println("Day of the week for " + date + " is " + date.getDayOfWeek());
    }
}

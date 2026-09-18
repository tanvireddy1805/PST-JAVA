import java.time.LocalDate;

public class WEEK3_TASK3_DayOfTheYear {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 9, 18);
        int dayOfYear = date.getDayOfYear();

        System.out.println(date + " is day " + dayOfYear + " of the year.");
    }
}

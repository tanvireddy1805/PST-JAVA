import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CLASS_TASK1_AgeCalculator {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2006, 1, 26);
        LocalDateTime now = LocalDateTime.now();
        Period age = Period.between(birthDate, now.toLocalDate());

        System.out.println("Current Date: " + now.toLocalDate());
        System.out.println("Current Time: " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Your Age: " + age.getYears() + " years, "
                + age.getMonths() + " months, " + age.getDays() + " days");
    }
}

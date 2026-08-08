import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class T1 {

    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(2006, 1, 26);

        LocalDateTime now = LocalDateTime.now();
        LocalDate currentDate = now.toLocalDate();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: "
                + now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        System.out.println("Your Age: " + age.getYears() + " years, "
                + age.getMonths() + " months, "
                + age.getDays() + " days");
    }
}

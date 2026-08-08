import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class T2 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Current Date: " + now.toLocalDate());
        System.out.println("Current Year: " + now.getYear());
        System.out.println("Current Month: " + now.getMonth());
        System.out.println("Current Day: " + now.getDayOfMonth());

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Time: " + now.format(timeFormat));
    }
}
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TASK16 {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current Date and Time: " + current.format(format));
    }
}

import java.util.Scanner;

public class TASK29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int hour = Integer.parseInt(s.substring(0, 2));

        hour = hour % 12;

        if (s.endsWith("PM")) {
            hour += 12;
        }

        System.out.printf("%02d%s%n", hour, s.substring(2, 8));

        sc.close();
    }
}

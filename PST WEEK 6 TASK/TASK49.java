import java.util.*;

public class TASK49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int errors = 0;

        String pattern = "SOS";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pattern.charAt(i % 3)) {
                errors++;
            }
        }

        System.out.println(errors);

        sc.close();
    }
}

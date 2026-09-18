import java.util.*;

public class TASK45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int total = s.length();

            for (int i = 1; i < s.length(); i++) {
                int j = 0;

                while (i + j < s.length() &&
                       s.charAt(j) == s.charAt(i + j)) {
                    j++;
                }

                total += j;
            }

            System.out.println(total);
        }

        sc.close();
    }
}

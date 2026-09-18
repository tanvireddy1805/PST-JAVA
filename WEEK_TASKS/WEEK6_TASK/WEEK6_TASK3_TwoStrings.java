import java.util.*;

public class TASK47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            boolean found = false;

            boolean[] present = new boolean[26];

            for (char c : s1.toCharArray()) {
                present[c - 'a'] = true;
            }

            for (char c : s2.toCharArray()) {
                if (present[c - 'a']) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}

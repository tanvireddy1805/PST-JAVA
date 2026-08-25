import java.util.*;

public class TASK54 {

    public static int longestPalindrome(String s) {

        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            int left = i;
            int right = i;

            while (left >= 0 &&
                   right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                maxLength = Math.max(maxLength, right - left + 1);
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 &&
                   right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                maxLength = Math.max(maxLength, right - left + 1);
                left--;
                right++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = s.length();

        for (int i = 0; i < n; i++) {

            String rotated = s.substring(i) + s.substring(0, i);

            System.out.print(longestPalindrome(rotated) + " ");
        }

        sc.close();
    }
}

import java.util.*;

public class TASK51 {

    public static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            int left = 0;
            int right = s.length() - 1;

            while (left < right &&
                   s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }

            if (left >= right) {
                System.out.println(-1);
            } else if (isPalindrome(s, left + 1, right)) {
                System.out.println(left);
            } else if (isPalindrome(s, left, right - 1)) {
                System.out.println(right);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
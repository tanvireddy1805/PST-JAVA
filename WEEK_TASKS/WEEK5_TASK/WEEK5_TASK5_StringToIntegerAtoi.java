import java.util.*;

public class WEEK5_TASK5_StringToIntegerAtoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        int i = 0;
        int sign = 1;
        long result = 0;

        if (s.length() > 0 && (s.charAt(0) == '+' || s.charAt(0) == '-')) {
            if (s.charAt(0) == '-') {
                sign = -1;
            }
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
                break;
            }

            if (sign == -1 && -result < Integer.MIN_VALUE) {
                result = (long) Integer.MAX_VALUE + 1;
                break;
            }

            i++;
        }

        result *= sign;

        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }

        System.out.println(result);

        sc.close();
    }
}
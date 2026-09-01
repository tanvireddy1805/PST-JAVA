import java.util.*;

public class TASK70 {

    interface AdvancedArithmetic {

        int divisor_sum(int n);
    }

    static class Calculator implements AdvancedArithmetic {

        public int divisor_sum(int n) {

            int sum = 0;

            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {
                    sum += i;
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Calculator calculator =
            new Calculator();

        System.out.println(
            "I implemented: AdvancedArithmetic"
        );

        System.out.println(
            calculator.divisor_sum(n)
        );

        sc.close();
    }
}

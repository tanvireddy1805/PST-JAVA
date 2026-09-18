import java.util.*;

public class TASK74 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        try {

            int a = Integer.parseInt(first);
            int b = Integer.parseInt(second);

            System.out.println(a / b);

        } catch (NumberFormatException e) {

            System.out.println(
                "Exception: " +
                e.getClass().getSimpleName()
            );

        } catch (ArithmeticException e) {

            System.out.println(
                "Exception: " +
                e.getClass().getSimpleName()
            );
        }

        sc.close();
    }
}
bb                                                                                                                                                                                                                                                                                                                                                                                                    
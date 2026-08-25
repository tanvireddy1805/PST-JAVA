import java.util.*;

public class TASK48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String goal = sc.next();

        if (s.length() == goal.length() &&
            (s + s).contains(goal)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}

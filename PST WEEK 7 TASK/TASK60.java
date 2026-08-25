import java.util.*;

public class TASK60 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int grade = sc.nextInt();

            if (grade < 38) {
                System.out.println(grade);
            } else {

                int nextMultiple = ((grade / 5) + 1) * 5;

                if (nextMultiple - grade < 3) {
                    System.out.println(nextMultiple);
                } else {
                    System.out.println(grade);
                }
            }
        }

        sc.close();
    }
}

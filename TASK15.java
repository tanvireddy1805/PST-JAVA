import java.util.*;

public class TASK15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();

        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String first = sc.next();
            String second = sc.next();

            set.add(first + " " + second);

            System.out.println(set.size());
        }

        sc.close();
    }
}

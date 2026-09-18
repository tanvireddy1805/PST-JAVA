import java.util.*;

public class WEEK2_TASK9_JavaDequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int max = 0;

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i <= n - m; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + m; j++) {
                set.add(list.get(j));
            }

            max = Math.max(max, set.size());
        }

        System.out.println(max);
    }
}
import java.util.*;

public class WEEK12_TASK6_MaxDistinctElementsSlidingWindow {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);

            if (i >= k) {
                int old = a[i - k];
                map.put(old, map.get(old) - 1);

                if (map.get(old) == 0)
                    map.remove(old);
            }

            if (i >= k - 1)
                max = Math.max(max, map.size());
        }

        System.out.println(max);
    }
}
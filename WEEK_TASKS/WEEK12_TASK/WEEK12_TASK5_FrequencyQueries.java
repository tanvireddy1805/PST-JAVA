import java.util.*;

public class WEEK12_TASK5_FrequencyQueries {
    public static void main(String[] args) {
        int[][] queries = {
            {1, 5}, {1, 6}, {1, 5},
            {3, 2}, {2, 5}, {3, 2},
            {1, 6}, {3, 2}
        };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] q : queries) {
            int op = q[0], x = q[1];

            if (op == 1) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            } else if (op == 2) {
                if (map.getOrDefault(x, 0) > 0)
                    map.put(x, map.get(x) - 1);
            } else {
                int found = 0;

                for (int f : map.values()) {
                    if (f == x) {
                        found = 1;
                        break;
                    }
                }

                System.out.println(found);
            }
        }
    }
}

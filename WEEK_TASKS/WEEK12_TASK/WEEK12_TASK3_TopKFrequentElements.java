import java.util.*;

public class WEEK12_TASK3_TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            int c = map.get(b) - map.get(a);
            return c != 0 ? c : Integer.compare(a, b);
        });

        for (int i = 0; i < k; i++)
            System.out.print(list.get(i) + " ");
    }
}
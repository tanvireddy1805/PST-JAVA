import java.util.*;

public class WEEK2_TASK8_TopKFrequentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        for (int i = 0; i < k; i++)
            System.out.print(list.get(i) + " ");
    }
}
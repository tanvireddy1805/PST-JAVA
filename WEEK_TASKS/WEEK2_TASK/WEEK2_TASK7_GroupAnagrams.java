import java.util.*;

public class WEEK2_TASK7_GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        for (ArrayList<String> group : map.values()) {
            for (String word : group)
                System.out.print(word + " ");

            System.out.println();
        }
    }
}
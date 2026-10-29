import java.util.*;

public class WEEK12_TASK8_TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {
            "i", "love", "coding", "i", "love", "java"
        };

        int k = 2;
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        ArrayList<String> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            int c = map.get(b) - map.get(a);
            return c != 0 ? c : a.compareTo(b);
        });

        for (int i = 0; i < k; i++)
            System.out.println(list.get(i));
    }
}
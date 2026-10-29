import java.util.*;

public class WEEK12_TASK4_GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {
            "eat", "tea", "tan", "ate", "nat", "bat"
        };

        Map<String, ArrayList<String>> map = new LinkedHashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        System.out.println(map.values());
    }
}
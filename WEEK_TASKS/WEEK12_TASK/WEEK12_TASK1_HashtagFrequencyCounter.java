import java.util.*;

public class WEEK12_TASK1_HashtagFrequencyCounter {
    public static void main(String[] args) {
        String[] tags = {
            "#java", "#ai", "#java",
            "#code", "#ai", "#java"
        };

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String tag : tags)
            map.put(tag, map.getOrDefault(tag, 0) + 1);

        ArrayList<String> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            int c = map.get(b) - map.get(a);
            return c != 0 ? c : a.compareTo(b);
        });

        for (String tag : list)
            System.out.println(tag + " " + map.get(tag));
    }
}
import java.util.*;

public class WEEK12_TASK2_SparseStringQueries {
    public static void main(String[] args) {
        String[] words = {"aba", "baba", "aba", "xzxb"};
        String[] queries = {"aba", "xzxb", "ab"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        for (String query : queries)
            System.out.println(map.getOrDefault(query, 0));
    }
}
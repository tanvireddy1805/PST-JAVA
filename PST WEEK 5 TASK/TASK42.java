import java.util.*;

public class TASK42 {

    public static boolean matchesPattern(String word, String pattern) {

        if (word.length() != pattern.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (map1.containsKey(w) && map1.get(w) != p) {
                return false;
            }

            if (map2.containsKey(p) && map2.get(p) != w) {
                return false;
            }

            map1.put(w, p);
            map2.put(p, w);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String pattern = sc.next();

        for (String word : words) {
            if (matchesPattern(word, pattern)) {
                System.out.print(word + " ");
            }
        }

        sc.close();
    }
}

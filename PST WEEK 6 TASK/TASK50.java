import java.util.*;

public class TASK50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String p = sc.next();

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            System.out.println(result);
            sc.close();
            return;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {

            windowCount[s.charAt(i) - 'a']++;
            windowCount[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pCount, windowCount)) {
                result.add(i - p.length() + 1);
            }
        }

        System.out.println(result);

        sc.close();
    }
}

import java.util.*;

public class TASK52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        sc.close();
    }
}

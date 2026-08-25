import java.util.*;

public class TASK63 {

    public static <T> void printArray(T[] array) {

        for (T value : array) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] numbers = new Integer[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        String[] words = new String[m];

        for (int i = 0; i < m; i++) {
            words[i] = sc.next();
        }

        printArray(numbers);
        printArray(words);

        sc.close();
    }
}

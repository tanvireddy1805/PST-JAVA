import java.util.*;

public class TASK14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> frequency = new HashMap<>();

        int maxUnique = 0;

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            deque.addLast(number);
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);

            if (deque.size() > m) {
                int removed = deque.removeFirst();
                frequency.put(removed, frequency.get(removed) - 1);

                if (frequency.get(removed) == 0) {
                    frequency.remove(removed);
                }
            }

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, frequency.size());
            }
        }

        System.out.println("Maximum unique elements: " + maxUnique);

        sc.close();
    }
}
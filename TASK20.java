import java.util.PriorityQueue;
import java.util.Scanner;

public class TASK20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("Priority Queue: " + queue);

        System.out.println("Elements in priority order:");

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        sc.close();
    }
}
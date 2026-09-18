import java.util.PriorityQueue;

public class WEEK3_TASK5_JavaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(50);
        queue.add(10);
        queue.add(30);
        queue.add(20);

        System.out.println("Priority Queue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

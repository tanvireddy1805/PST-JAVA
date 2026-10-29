import java.util.*;

public class WEEK12_TASK7_SmartTrafficNavigation {
    public static void main(String[] args) {
        int n = 5, m = 4;

        int[][] roads = {
            {1, 2}, {2, 3}, {3, 4}, {4, 5}
        };

        int source = 1, dest = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int[] road : roads) {
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }

        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (cur == dest) {
                System.out.println("YES");
                return;
            }

            for (int next : graph.get(cur)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

        System.out.println("NO");
    }
}
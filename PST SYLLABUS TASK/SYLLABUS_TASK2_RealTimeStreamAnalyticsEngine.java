import java.util.*;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String sensor = sc.next();
            int temp = sc.nextInt();

            if (temp > 50) {
                map.putIfAbsent(sensor, new ArrayList<>());
                map.get(sensor).add(temp);
            }
        }

        ArrayList<String> sensors = new ArrayList<>(map.keySet());

        sensors.sort((a, b) -> {
            double avgA = average(map.get(a));
            double avgB = average(map.get(b));
            return Double.compare(avgB, avgA);
        });

        for (String sensor : sensors) {
            System.out.println(sensor + " " + average(map.get(sensor)));
        }
    }

    static double average(ArrayList<Integer> list) {
        int sum = 0;

        for (int x : list) {
            sum += x;
        }

        return (double) sum / list.size();
    }
}

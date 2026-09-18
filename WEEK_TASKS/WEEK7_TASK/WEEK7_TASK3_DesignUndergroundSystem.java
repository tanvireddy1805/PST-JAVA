import java.util.*;

public class WEEK7_TASK3_DesignUndergroundSystem {

    static class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    static class UndergroundSystem {

        HashMap<Integer, CheckIn> checkIns = new HashMap<>();

        HashMap<String, double[]> trips = new HashMap<>();

        void checkIn(int id, String stationName, int time) {
            checkIns.put(id, new CheckIn(stationName, time));
        }

        void checkOut(int id, String stationName, int time) {

            CheckIn checkIn = checkIns.get(id);

            String route = checkIn.station + "#" + stationName;

            double duration = time - checkIn.time;

            if (!trips.containsKey(route)) {
                trips.put(route, new double[]{0, 0});
            }

            trips.get(route)[0] += duration;
            trips.get(route)[1]++;

            checkIns.remove(id);
        }

        double getAverageTime(String startStation, String endStation) {

            String route = startStation + "#" + endStation;

            double[] data = trips.get(route);

            return data[0] / data[1];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UndergroundSystem system = new UndergroundSystem();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("checkIn")) {

                int id = sc.nextInt();
                String station = sc.next();
                int time = sc.nextInt();

                system.checkIn(id, station, time);

            } else if (operation.equals("checkOut")) {

                int id = sc.nextInt();
                String station = sc.next();
                int time = sc.nextInt();

                system.checkOut(id, station, time);

            } else {

                String start = sc.next();
                String end = sc.next();

                System.out.println(
                    system.getAverageTime(start, end)
                );
            }
        }

        sc.close();
    }
}


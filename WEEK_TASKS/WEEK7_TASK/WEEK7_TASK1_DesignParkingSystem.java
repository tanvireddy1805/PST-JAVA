import java.util.*;

public class WEEK7_TASK1_DesignParkingSystem {

    static class ParkingSystem {
        int big;
        int medium;
        int small;

        ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        boolean addCar(int carType) {

            if (carType == 1 && big > 0) {
                big--;
                return true;
            }

            if (carType == 2 && medium > 0) {
                medium--;
                return true;
            }

            if (carType == 3 && small > 0) {
                small--;
                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int big = sc.nextInt();
        int medium = sc.nextInt();
        int small = sc.nextInt();

        ParkingSystem parking = new ParkingSystem(big, medium, small);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int carType = sc.nextInt();

            System.out.println(parking.addCar(carType));
        }

        sc.close();
    }
}


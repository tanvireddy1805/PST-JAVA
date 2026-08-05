public class TASK13 {

    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        TASK13 obj = new TASK13();

        int[] gain = {-5, 1, 5, 0, -7};

        System.out.println(obj.largestAltitude(gain));
    }
}

import java.util.*;

public class WEEK2_TASK6_FindHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int height = 0;
        int highest = 0;

        for (int i = 0; i < n; i++) {
            height += sc.nextInt();

            if (height > highest)
                highest = height;
        }

        System.out.println(highest);
    }
}
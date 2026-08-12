import java.util.ArrayList;
import java.util.Scanner;

public class TASK21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("ArrayList: " + list);

        System.out.print("Enter element to search: ");
        int value = sc.nextInt();

        if (list.contains(value)) {
            System.out.println(value + " is present in the ArrayList.");
        } else {
            System.out.println(value + " is not present in the ArrayList.");
        }

        sc.close();
    }
}
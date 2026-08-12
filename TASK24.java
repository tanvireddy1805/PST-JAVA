import java.util.Arrays;
import java.util.Scanner;

public class TASK24 {

    public static String[] sortPeople(String[] names, int[] heights) {

        Integer[] index = new Integer[names.length];

        for (int i = 0; i < names.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) ->
                Integer.compare(heights[b], heights[a]));

        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            result[i] = names[index[i]];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] heights = new int[n];

        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        String[] result = sortPeople(names, heights);

        System.out.println("People sorted by height:");

        for (String name : result) {
            System.out.println(name);
        }

        sc.close();
    }
}
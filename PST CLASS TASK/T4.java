import java.util.Arrays;
import java.util.List;

public class T4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2, 4, 3);

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Square of " + number + " is " + (number * number));
            }
        }
    }
}
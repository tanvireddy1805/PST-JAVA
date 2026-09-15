import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLASS_TASK5_SquareListNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> squares = new ArrayList<>();

        for (int number : numbers) {
            squares.add(number * number);
        }
        System.out.println(squares);
    }
}

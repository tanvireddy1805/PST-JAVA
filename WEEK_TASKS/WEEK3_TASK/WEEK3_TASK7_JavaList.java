import java.util.ArrayList;
import java.util.List;

public class WEEK3_TASK7_JavaList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("List elements: " + numbers);
        System.out.println("Second element: " + numbers.get(1));
    }
}

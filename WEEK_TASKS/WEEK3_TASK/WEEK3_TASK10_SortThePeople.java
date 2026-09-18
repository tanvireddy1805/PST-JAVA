import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WEEK3_TASK10_SortThePeople {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("John");
        people.add("Alice");
        people.add("Bob");
        people.add("Charlie");

        Collections.sort(people, Comparator.naturalOrder());
        System.out.println("Sorted people: " + people);
    }
}

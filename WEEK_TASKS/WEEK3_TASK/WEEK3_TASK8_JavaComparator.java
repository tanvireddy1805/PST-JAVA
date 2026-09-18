import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WEEK3_TASK8_JavaComparator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        Collections.sort(names, Comparator.naturalOrder());
        System.out.println("Sorted names: " + names);
    }
}

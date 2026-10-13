import java.util.Arrays;
import java.util.TreeSet;

public class WEEK10_TASK7_SortedUniqueMarks {
    public static void main(String[] args) {
        Integer[] marks = {78, 92, 85, 78, 96, 85, 71};
        TreeSet<Integer> sortedUniqueMarks = new TreeSet<>(Arrays.asList(marks));

        System.out.println("Original marks: " + Arrays.toString(marks));
        System.out.println("Sorted unique marks: " + sortedUniqueMarks);
        System.out.println("Lowest mark: " + sortedUniqueMarks.first());
        System.out.println("Highest mark: " + sortedUniqueMarks.last());
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class CLASS_TASK6_RemoveDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 4, 6, 8, 10, 2);
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(numbers);
        List<Integer> uniqueNumbers = new ArrayList<>(uniqueSet);
        System.out.println(uniqueNumbers);
    }
}

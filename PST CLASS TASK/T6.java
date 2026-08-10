import java.util.*;
import java.util.stream.*;

public class T6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 40, 40);

        List<Integer> result = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Output: " + result);
    }
}
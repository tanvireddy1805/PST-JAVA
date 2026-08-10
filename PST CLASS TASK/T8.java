import java.util.*;

public class T8 {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(60, 75, 80, 90, 65, 85, 70, 95);

        long count = marks.stream()
                .filter(mark -> mark > 75)
                .count();

        System.out.println("Number of students who scored above 75 = " + count);
    }
}

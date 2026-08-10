import java.util.*;

public class T7 {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(75, 80, 85, 90, 95);

        int total = marks.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = marks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        int max = marks.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        int min = marks.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
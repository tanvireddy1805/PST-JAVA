import java.util.ArrayList;
import java.util.List;

public class WEEK10_TASK4_StudentMarksArrayList {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(81);
        marks.add(74);
        marks.add(96);
        marks.add(88);

        int total = 0;
        System.out.println("Student marks: " + marks);
        for (int mark : marks) {
            total += mark;
        }
        System.out.printf("Number of marks: %d%n", marks.size());
        System.out.printf("Average mark: %.2f%n", (double) total / marks.size());
    }
}

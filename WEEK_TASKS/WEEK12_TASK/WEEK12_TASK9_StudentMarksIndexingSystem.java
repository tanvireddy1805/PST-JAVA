import java.util.*;

public class WEEK12_TASK9_StudentMarksIndexingSystem {
    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();
        HashMap<Integer, Integer> marks = new HashMap<>();

        names.put(101, "Ravi");
        marks.put(101, 85);

        names.put(102, "Priya");
        marks.put(102, 92);

        names.put(103, "Arun");
        marks.put(103, 78);

        int[] queries = {102, 103, 105};

        for (int id : queries) {
            if (names.containsKey(id))
                System.out.println(names.get(id) + " " + marks.get(id));
            else
                System.out.println("Student not found");
        }
    }
}
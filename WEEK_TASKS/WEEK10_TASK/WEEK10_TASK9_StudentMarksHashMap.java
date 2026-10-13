import java.util.LinkedHashMap;
import java.util.Map;

public class WEEK10_TASK9_StudentMarksHashMap {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new LinkedHashMap<>();
        studentMarks.put("Amina", 89);
        studentMarks.put("David", 76);
        studentMarks.put("Lina", 94);
        studentMarks.put("Omar", 83);

        System.out.println("Student marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

        String studentToFind = "Lina";
        Integer mark = studentMarks.get(studentToFind);
        if (mark != null) {
            System.out.printf("%s scored %d marks.%n", studentToFind, mark);
        } else {
            System.out.println(studentToFind + " was not found.");
        }
    }
}

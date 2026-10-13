import java.util.LinkedHashSet;
import java.util.Set;

public class WEEK10_TASK8_CommonSubjects {
    public static void main(String[] args) {
        Set<String> studentOneSubjects = new LinkedHashSet<>();
        studentOneSubjects.add("Mathematics");
        studentOneSubjects.add("Computer Science");
        studentOneSubjects.add("Physics");

        Set<String> studentTwoSubjects = new LinkedHashSet<>();
        studentTwoSubjects.add("Biology");
        studentTwoSubjects.add("Physics");
        studentTwoSubjects.add("Computer Science");

        Set<String> commonSubjects = new LinkedHashSet<>(studentOneSubjects);
        commonSubjects.retainAll(studentTwoSubjects);

        System.out.println("Student 1 subjects: " + studentOneSubjects);
        System.out.println("Student 2 subjects: " + studentTwoSubjects);
        System.out.println("Common subjects: " + commonSubjects);
    }
}

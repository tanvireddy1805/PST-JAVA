import java.util.ArrayList;
import java.util.Comparator;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class TASK23 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 85));
        students.add(new Student("Anu", 95));
        students.add(new Student("Kiran", 75));
        students.add(new Student("Priya", 90));

        students.sort(new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return b.marks - a.marks;
            }
        });

        System.out.println("Students sorted by marks:");

        for (Student s : students) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
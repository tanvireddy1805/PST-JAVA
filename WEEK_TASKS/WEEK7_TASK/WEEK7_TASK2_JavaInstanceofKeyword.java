import java.util.*;

public class WEEK7_TASK2_JavaInstanceofKeyword {

    static class Student {
    }

    static class Rockstar {
    }

    static class Hacker {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();

            Object obj;

            if (type.equals("Student")) {
                obj = new Student();
            } else if (type.equals("Rockstar")) {
                obj = new Rockstar();
            } else {
                obj = new Hacker();
            }

            if (obj instanceof Student) {
                studentCount++;
            }

            if (obj instanceof Rockstar) {
                rockstarCount++;
            }

            if (obj instanceof Hacker) {
                hackerCount++;
            }
        }

        System.out.println(
            studentCount + " " +
            rockstarCount + " " +
            hackerCount
        );

        sc.close();
    }
}


import java.util.ArrayList;

public class WEEK3_TASK6_JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("ArrayList elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

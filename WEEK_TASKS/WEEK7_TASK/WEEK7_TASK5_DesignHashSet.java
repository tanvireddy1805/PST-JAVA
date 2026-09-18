import java.util.*;

public class WEEK7_TASK5_DesignHashSet {

    static class MyHashSet {

        boolean[] set = new boolean[1000001];

        void add(int key) {
            set[key] = true;
        }

        void remove(int key) {
            set[key] = false;
        }

        boolean contains(int key) {
            return set[key];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyHashSet hashSet = new MyHashSet();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            int value = sc.nextInt();

            if (operation.equals("add")) {

                hashSet.add(value);

            } else if (operation.equals("remove")) {

                hashSet.remove(value);

            } else if (operation.equals("contains")) {

                System.out.println(
                    hashSet.contains(value)
                );
            }
        }

        sc.close();
    }
}


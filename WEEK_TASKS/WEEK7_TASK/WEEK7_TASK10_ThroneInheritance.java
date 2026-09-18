import java.util.*;

public class WEEK7_TASK10_ThroneInheritance {

    static class ThroneInheritance {

        String king;
        HashMap<String, String> parent = new HashMap<>();
        HashMap<String, ArrayList<String>> children = new HashMap<>();
        HashSet<String> dead = new HashSet<>();

        ThroneInheritance(String kingName) {
            king = kingName;
            children.put(kingName, new ArrayList<>());
        }

        void birth(String parentName, String childName) {

            parent.put(childName, parentName);

            children.putIfAbsent(
                parentName,
                new ArrayList<>()
            );

            children.put(
                childName,
                new ArrayList<>()
            );

            children.get(parentName).add(childName);
        }

        void death(String name) {
            dead.add(name);
        }

        void dfs(String name, ArrayList<String> result) {

            if (!dead.contains(name)) {
                result.add(name);
            }

            if (children.containsKey(name)) {

                for (String child : children.get(name)) {
                    dfs(child, result);
                }
            }
        }

        ArrayList<String> getInheritanceOrder() {

            ArrayList<String> result = new ArrayList<>();

            dfs(king, result);

            return result;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String kingName = sc.next();

        ThroneInheritance throne =
            new ThroneInheritance(kingName);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("birth")) {

                String parent = sc.next();
                String child = sc.next();

                throne.birth(parent, child);

            } else if (operation.equals("death")) {

                String name = sc.next();

                throne.death(name);

            } else if (operation.equals("order")) {

                ArrayList<String> order =
                    throne.getInheritanceOrder();

                for (String name : order) {
                    System.out.print(name + " ");
                }

                System.out.println();
            }
        }

        sc.close();
    }
}


import java.util.*;

public class TASK68 {

    static abstract class Tree {
        int value;
        int depth;

        Tree(int value, int depth) {
            this.value = value;
            this.depth = depth;
        }

        abstract void accept(Visitor visitor);
    }

    static class TreeNode extends Tree {

        ArrayList<Tree> children = new ArrayList<>();

        TreeNode(int value, int depth) {
            super(value, depth);
        }

        void accept(Visitor visitor) {

            visitor.visitNode(this);

            for (Tree child : children) {
                child.accept(visitor);
            }
        }
    }

    static class TreeLeaf extends Tree {

        TreeLeaf(int value, int depth) {
            super(value, depth);
        }

        void accept(Visitor visitor) {
            visitor.visitLeaf(this);
        }
    }

    interface Visitor {

        void visitNode(TreeNode node);

        void visitLeaf(TreeLeaf leaf);
    }

    static class SumInLeavesVisitor implements Visitor {

        int sum = 0;

        public void visitNode(TreeNode node) {
        }

        public void visitLeaf(TreeLeaf leaf) {
            sum += leaf.value;
        }

        int getResult() {
            return sum;
        }
    }

    static class ProductOfRedNodesVisitor implements Visitor {

        long product = 1;

        public void visitNode(TreeNode node) {
        }

        public void visitLeaf(TreeLeaf leaf) {
        }

        int getResult() {
            return (int) product;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int[] colors = new int[n];

        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> graph =
            new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u - 1).add(v - 1);
            graph.get(v - 1).add(u - 1);
        }

        TreeNode root = buildTree(
            0, -1, 0, values, colors, graph
        );

        SumInLeavesVisitor visitor =
            new SumInLeavesVisitor();

        root.accept(visitor);

        System.out.println(visitor.getResult());

        sc.close();
    }

    static TreeNode buildTree(
        int current,
        int parent,
        int depth,
        int[] values,
        int[] colors,
        ArrayList<ArrayList<Integer>> graph
    ) {

        ArrayList<Integer> children =
            graph.get(current);

        boolean leaf = true;

        for (int next : children) {
            if (next != parent) {
                leaf = false;
                break;
            }
        }

        if (leaf) {
            return new TreeNode(values[current], depth);
        }

        TreeNode node =
            new TreeNode(values[current], depth);

        for (int next : children) {

            if (next != parent) {

                node.children.add(
                    buildTree(
                        next,
                        current,
                        depth + 1,
                        values,
                        colors,
                        graph
                    )
                );
            }
        }

        return node;
    }
}

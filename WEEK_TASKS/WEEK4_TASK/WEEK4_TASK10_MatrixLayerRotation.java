import java.util.*;

public class TASK34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            ArrayList<Integer> list = new ArrayList<>();

            // Left column
            for (int i = layer; i < m - layer; i++) {
                list.add(matrix[i][layer]);
            }

            // Bottom row
            for (int j = layer + 1; j < n - layer; j++) {
                list.add(matrix[m - layer - 1][j]);
            }

            // Right column
            for (int i = m - layer - 2; i >= layer; i--) {
                list.add(matrix[i][n - layer - 1]);
            }

            // Top row
            for (int j = n - layer - 2; j > layer; j--) {
                list.add(matrix[layer][j]);
            }

            int size = list.size();
            int shift = r % size;
            int index = 0;

            // Left column
            for (int i = layer; i < m - layer; i++) {
                matrix[i][layer] =
                    list.get((index + shift) % size);
                index++;
            }

            // Bottom row
            for (int j = layer + 1; j < n - layer; j++) {
                matrix[m - layer - 1][j] =
                    list.get((index + shift) % size);
                index++;
            }

            // Right column
            for (int i = m - layer - 2; i >= layer; i--) {
                matrix[i][n - layer - 1] =
                    list.get((index + shift) % size);
                index++;
            }

            // Top row
            for (int j = n - layer - 2; j > layer; j--) {
                matrix[layer][j] =
                    list.get((index + shift) % size);
                index++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

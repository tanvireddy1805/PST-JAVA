import java.util.Scanner;

public class TASK33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int k = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int sum = 0;

                int startRow = Math.max(0, i - k);
                int endRow = Math.min(rows - 1, i + k);

                int startCol = Math.max(0, j - k);
                int endCol = Math.min(cols - 1, j + k);

                for (int r = startRow; r <= endRow; r++) {
                    for (int c = startCol; c <= endCol; c++) {
                        sum += matrix[r][c];
                    }
                }

                result[i][j] = sum;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
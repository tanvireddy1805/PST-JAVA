import java.util.Scanner;

public class TASK31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            left += matrix[i][i];
            right += matrix[i][n - 1 - i];
        }

        System.out.println(Math.abs(left - right));

        sc.close();
    }
}

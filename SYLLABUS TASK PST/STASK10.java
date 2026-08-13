import java.util.Scanner;

public class STASK10 {

    static boolean login(String username, String password) {

        if (username.length() < 3 || username.length() > 20) {
            return false;
        }

        if (password.length() < 6 || password.length() > 20) {
            return false;
        }

        if (username.equals("admin") && password.equals("admin123")) {
            return true;
        }

        if (username.equals("user") && password.equals("user123")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();

            try {
                if (login(username, password)) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("FAILURE");
                }

            } catch (Exception e) {
                System.out.println("FAILURE");
            }
        }

        sc.close();
    }
}
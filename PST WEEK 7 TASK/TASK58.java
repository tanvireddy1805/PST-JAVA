import java.util.*;

public class TASK58 {

    static class BrowserHistory {

        ArrayList<String> history = new ArrayList<>();
        int current;

        BrowserHistory(String homepage) {
            history.add(homepage);
            current = 0;
        }

        void visit(String url) {

            while (history.size() > current + 1) {
                history.remove(history.size() - 1);
            }

            history.add(url);
            current++;
        }

        String back(int steps) {

            current = Math.max(0, current - steps);

            return history.get(current);
        }

        String forward(int steps) {

            current = Math.min(
                history.size() - 1,
                current + steps
            );

            return history.get(current);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String homepage = sc.next();

        BrowserHistory browser = new BrowserHistory(homepage);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("visit")) {

                String url = sc.next();

                browser.visit(url);

            } else if (operation.equals("back")) {

                int steps = sc.nextInt();

                System.out.println(browser.back(steps));

            } else if (operation.equals("forward")) {

                int steps = sc.nextInt();

                System.out.println(browser.forward(steps));
            }
        }

        sc.close();
    }
}
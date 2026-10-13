import java.util.ArrayDeque;
import java.util.Deque;

public class WEEK10_TASK3_BrowserHistory {
    private final Deque<String> backStack = new ArrayDeque<>();
    private final Deque<String> forwardStack = new ArrayDeque<>();
    private String currentPage;

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No previous page.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No forward page.");
        }
    }

    public static void main(String[] args) {
        WEEK10_TASK3_BrowserHistory browser = new WEEK10_TASK3_BrowserHistory();
        browser.visit("example.com");
        browser.visit("news.example.com");
        browser.visit("store.example.com");
        browser.back();
        browser.back();
        browser.forward();
        browser.visit("library.example.com");
        browser.forward();
    }
}

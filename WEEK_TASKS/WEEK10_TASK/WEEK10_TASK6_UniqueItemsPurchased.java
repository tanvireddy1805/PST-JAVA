import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class WEEK10_TASK6_UniqueItemsPurchased {
    public static void main(String[] args) {
        String[] purchases = {"Milk", "Bread", "Eggs", "Bread", "Coffee", "Milk"};
        Set<String> uniqueItems = new LinkedHashSet<>(Arrays.asList(purchases));

        System.out.println("All purchased items: " + Arrays.toString(purchases));
        System.out.println("Unique items purchased: " + uniqueItems);
        System.out.println("Number of unique items: " + uniqueItems.size());
    }
}

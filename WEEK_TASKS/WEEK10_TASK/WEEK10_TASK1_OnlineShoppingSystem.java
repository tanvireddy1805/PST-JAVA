import java.util.LinkedHashMap;
import java.util.Map;

public class WEEK10_TASK1_OnlineShoppingSystem {
    private static class Product {
        private final String name;
        private final double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Map<Product, Integer> cart = new LinkedHashMap<>();
        Product book = new Product("Java Programming Book", 29.99);
        Product headphones = new Product("Headphones", 49.50);
        cart.put(book, 2);
        cart.put(headphones, 1);

        double total = 0;
        System.out.println("Online Shopping Cart");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            double subtotal = product.price * quantity;
            total += subtotal;
            System.out.printf("%s x%d: $%.2f%n", product.name, quantity, subtotal);
        }
        System.out.printf("Total: $%.2f%n", total);
    }
}

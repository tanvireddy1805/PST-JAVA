import java.util.*;

public class WEEK12_TASK10_ProductInventoryLowStock {
    static class Product {
        String name;
        int stock;
        double price;

        Product(String name, int stock, double price) {
            this.name = name;
            this.stock = stock;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Product> products = new HashMap<>();

        products.put(101, new Product("Pen", 10, 5.0));
        products.put(102, new Product("Book", 4, 50.0));
        products.put(103, new Product("Bag", 8, 300.0));

        // Update stock after selling 7 pens
        products.get(101).stock -= 7;

        int limit = 5;

        System.out.println("Low Stock Products:");
        for (Map.Entry<Integer, Product> e : products.entrySet()) {
            if (e.getValue().stock < limit)
                System.out.println(e.getValue().name + " " +
                                   e.getValue().stock);
        }

        ArrayList<Map.Entry<Integer, Product>> list =
            new ArrayList<>(products.entrySet());

        list.sort(Comparator.comparingInt(e -> e.getValue().stock));

        System.out.println("Sorted Inventory:");
        for (Map.Entry<Integer, Product> e : list) {
            System.out.println(e.getKey() + " " +
                e.getValue().name + " " + e.getValue().stock);
        }

        // Search product by ID
        int id = 102;
        Product p = products.get(id);

        System.out.println("Search: " + p.name + " " +
                           p.stock + " " + p.price);
    }
}

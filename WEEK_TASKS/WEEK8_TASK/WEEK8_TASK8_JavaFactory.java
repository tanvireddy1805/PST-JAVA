import java.util.*;

public class TASK72 {

    interface Food {
        String getType();
    }

    static class Pizza implements Food {

        public String getType() {
            return "Pizza";
        }
    }

    static class Cake implements Food {

        public String getType() {
            return "Cake";
        }
    }

    static class FoodFactory {

        Food getFood(String order) {

            if (order.equalsIgnoreCase("pizza")) {
                return new Pizza();
            }

            if (order.equalsIgnoreCase("cake")) {
                return new Cake();
            }

            return null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String order = sc.next();

        FoodFactory factory =
            new FoodFactory();

        Food food = factory.getFood(order);

        if (food != null) {
            System.out.println(
                "The factory returned " +
                food.getClass().getSimpleName()
            );

            System.out.println(
                "I'm eating " + food.getType()
            );
        } else {
            System.out.println("Unknown food");
        }

        sc.close();
    }
}
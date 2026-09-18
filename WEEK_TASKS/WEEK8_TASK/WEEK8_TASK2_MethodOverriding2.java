

public class TASK66 {

    static class Arithmetic {
        int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {

        @Override
        int add(int a, int b) {
            return super.add(a, b);
        }
    }

    public static void main(String[] args) {

        Adder adder = new Adder();

        System.out.println("My superclass is: Arithmetic");

        System.out.println(
            adder.add(42, 13) + " " +
            adder.add(10, 10)
        );
    }
}
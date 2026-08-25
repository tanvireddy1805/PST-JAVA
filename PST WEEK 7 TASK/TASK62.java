import java.util.*;

public class TASK62 {

    static class Arithmetic {

        int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Adder adder = new Adder();

        System.out.println(adder.add(a, b));

        sc.close();
    }
}

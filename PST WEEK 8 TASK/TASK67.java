import java.util.*;

public class TASK67 {

    static class Singleton {

        private static Singleton singleInstance;

        private Singleton() {
        }

        public static Singleton getSingleInstance() {

            if (singleInstance == null) {
                singleInstance = new Singleton();
            }

            return singleInstance;
        }

        public String str;

        public void printMessage() {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Singleton instance =
            Singleton.getSingleInstance();

        instance.str = input;

        instance.printMessage();

        sc.close();
    }
}

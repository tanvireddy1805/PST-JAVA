import java.util.Scanner;

class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }
}

public class STASK9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        String operator = sc.next();
        double b = sc.nextDouble();

        Calculator calc = new Calculator();

        try {
            double result;

            if (operator.equals("+")) {
                result = calc.add(a, b);

                if (result == a + b) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                }

            } else if (operator.equals("/")) {
                result = calc.divide(a, b);

                if (result == a / b) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                }

            } else {
                System.out.println("Test Failed");
            }

        } catch (Exception e) {
            System.out.println("Test Failed");
        }

        sc.close();
    }
}

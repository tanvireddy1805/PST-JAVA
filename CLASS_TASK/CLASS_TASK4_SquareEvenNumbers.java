public class CLASS_TASK4_SquareEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 4, 3};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Square of " + number + " is " + (number * number));
            }
        }
    }
}

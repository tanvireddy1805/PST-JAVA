public class CLASS_TASK7_ListStatistics {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int total = 0;
        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int number : numbers) {
            total += number;
            if (number > maximum) maximum = number;
            if (number < minimum) minimum = number;
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + (double) total / numbers.length);
        System.out.println("Max: " + maximum);
        System.out.println("Min: " + minimum);
    }
}

public class WEEK1_TASK3_BinarySearch {
    static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (numbers[middle] == target) return middle;
            if (numbers[middle] < target) low = middle + 1;
            else high = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = binarySearch(numbers, target);

        if (result == -1) System.out.println("Element not present in the array.");
        else System.out.println("Element found at index: " + result);
    }
}

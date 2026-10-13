import java.util.Arrays;

public class WEEK10_TASK2_StudentMarksDynamicArray {
    private static class DynamicIntArray {
        private int[] values = new int[2];
        private int size;

        void add(int value) {
            if (size == values.length) {
                values = Arrays.copyOf(values, values.length * 2);
            }
            values[size++] = value;
        }

        int size() {
            return size;
        }

        int get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            return values[index];
        }
    }

    public static void main(String[] args) {
        DynamicIntArray marks = new DynamicIntArray();
        marks.add(78);
        marks.add(92);
        marks.add(85);
        marks.add(88);

        int total = 0;
        System.out.print("Student marks: ");
        for (int i = 0; i < marks.size(); i++) {
            System.out.print(marks.get(i) + (i + 1 < marks.size() ? ", " : ""));
            total += marks.get(i);
        }
        System.out.printf("%nAverage: %.2f%n", (double) total / marks.size());
    }
}

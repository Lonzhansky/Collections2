package lesson19.demos._2_searching._01_array_search;

// Знаходимо суму елементів масиву
public class ArraySum {

    public static void main(String[] args) {
        getOutput(handleData(getData()));
    }

    private static int[] getData() {
        return new int[]{24, 7, 95, 13, 20};
    }

    private static int handleData(int[] nums) {
        int sum = 0;
        for (int value : nums) {
            sum += value;
        }
        return sum;
    }

    private static void getOutput(int output) {
        System.out.println("Sum is " + output);
    }
}

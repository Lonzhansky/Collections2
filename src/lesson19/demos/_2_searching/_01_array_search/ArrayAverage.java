package lesson19.demos._2_searching._01_array_search;

// Пошук середнього арифметичного значення.
// Середнє арифметичне = сума чисел/кількість чисел.
public class ArrayAverage {

    public static void main(String[] args) {
        getOutput(handleData(getData()));
    }

    private static int[] getData() {
        return new int[]{5, 8, 12, -8, -4};
    }

    private static double handleData(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

    private static void getOutput(double average) {
        System.out.printf("Average value: %.3f", average);
    }
}

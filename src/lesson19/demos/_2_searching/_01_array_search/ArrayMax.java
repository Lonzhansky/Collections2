package lesson19.demos._2_searching._01_array_search;

// Пошук максимального значення в масиві
public class ArrayMax {

    public static void main(String[] args) {
        getOutput(handleData(getData()));
    }

    private static int[] getData() {
        return new int[]{24, 7, 95, 13, 20};
    }

    private static int handleData(int[] nums) {
        int maxValue = nums[0];
        // Через цикл знаходимо максимум
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    private static void getOutput(int output) {
        System.out.println("Max value: " + output);
    }
}

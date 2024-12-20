package lesson19.demos._2_searching._01_array_search;

// Пошук мінімального значення у масиві
public class ArrayMin {

    public static void main(String[] args) {
        getOutput(handleData(getData()));
    }

    private static int[] getData() {
        return new int[]{24, 7, 95, 13, 20};
    }

    private static int handleData(int[] nums) {
        int minValue = nums[0];
        // Через цикл знаходимо мінімум
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }

    private static void getOutput(int output) {
        System.out.println("Min value: " + output);
    }
}

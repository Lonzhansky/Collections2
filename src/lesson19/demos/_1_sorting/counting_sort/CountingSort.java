package lesson19.demos._1_sorting.counting_sort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {

        int[] input = {4, 5, 21, 7, 2, 8, 13, 3, 11, 6};

        int k = 21;

        System.out.println("Array before sorting\n" +
                Arrays.toString(input));

        countingSort(input, k);

        System.out.println("Array after sorting\n" +
                Arrays.toString(input));
    }

    // Метод сортування
    public static void countingSort(int[] input, int k) {
        // Створюємо кошики
        int[] counts = new int[k + 1];
        int counter = 0;
        // Заповнюємо кошики
        for (int i : input) {
            counts[i]++;
            counter++;
        }
        // Сортування масиву
        int ndx = 0;
        for (int i = 0; i < counts.length; i++) {
            while (0 < counts[i]) {
                counter++;
                input[ndx++] = i;
                counts[i]--;
            }
        }
        System.out.println(counter);
    }
}

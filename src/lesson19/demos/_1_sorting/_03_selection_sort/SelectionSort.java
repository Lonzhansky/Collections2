package lesson19.demos._1_sorting._03_selection_sort;

public class SelectionSort {

    public static void main(String[] args) {
        getOutput(selectionSort(getData()));
    }

    private static int[] getData() {
        return new int[]{4, 5, 21, 7, 2, 8, 13, 3, 11, 6};
    }

    private static int[] selectionSort(int[] numbers) {
        for (int i = 0; i <= numbers.length - 1; i++) {

            int small = i;
            for (int j = small + 1; j <= numbers.length - 1; j++) {
                if (numbers[j] < numbers[small]) {
                    small = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[small];
            numbers[small] = temp;

//            swap(numbers, i, getSmallest(numbers, i));
        }
        return numbers;
    }

    // Отримання позиції з масиву numbers
    // від меншого до найбільшого
    private static int getSmallest(int[] numbers,
                                   int low) {
        int small = low;
        for (int i = low + 1; i <= numbers.length - 1; i++) {
            if (numbers[i] < numbers[small]) {
                small = i;
            }
        }
        return small;
    }

    // swap (перестановка) елементів
    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    private static void getOutput(int[] numbers) {
        for (int number : numbers)
            System.out.print(number + " ");
    }

}

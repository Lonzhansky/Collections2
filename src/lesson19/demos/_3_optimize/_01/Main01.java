package lesson19.demos._3_optimize._01;

// Бульбашкове сортування масиву.
// Часова складність O(N^2).
// Просторова (додаткова) складність O(1).
// ОДНАК, сортування завжди виконується за час O(N^2),
// навіть якщо масив відсортовано.
// МОЖНА оптимізувати, перервавши алгоритм, якщо
// внутрішній цикл не викликав перестановки.
public class Main01 {

    public static void main(String[] args) {
        int[] data = new DataRepository().getData();
        System.out.println("Initial data:");
        getOutput(data);
        bubbleSort(data);
        System.out.println("Sorted data:");
        getOutput(data);
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Сортування через вкладений for
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // Перестановка
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    private static void getOutput(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}

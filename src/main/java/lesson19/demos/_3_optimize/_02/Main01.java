package lesson19.demos._3_optimize._02;

// Бульбашкове сортування масиву.
// ОДНАК, алгоритм сортування вимагає O(N^2),
// навіть у найкращому разі.
// МОЖНА оптимізувати його, використовуючи boolean прапор.
// Відсутність перестановок свідчить про завершення
// сортування.
// Якщо масив вже відсортовано, можемо використати
// цей прапор, щоб пропустити проходи, що залишилися.
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

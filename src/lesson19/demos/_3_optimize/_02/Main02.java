package lesson19.demos._3_optimize._02;

// Бульбашкове сортування масиву.
// Оптимізація через використання boolean прапору.
// Відсутність перестановок свідчить про завершення
// сортування.
// Якщо масив вже відсортовано, можемо використати
// цей прапор, щоб пропустити проходи, що залишилися.
// Можемо домогтися O(N) у найкращому разі.
public class Main02 {

    public static void main(String[] args) {
        int[] data = new DataRepository().getData();
        System.out.println("Initial data:");
        getOutput(data);
        bubbleSort(data);
        System.out.println("Sorted data:");
        getOutput(data);
    }

    private static void bubbleSort(int[] arr) {

        int i = 0;
        int n = arr.length;
        // boolean прапор
        boolean isSwapNeed;

        while (i < n - 1) {
            isSwapNeed = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwapNeed = true;
                }
            }
            if (!isSwapNeed)
                break;
            i++;
        }
    }

    private static void getOutput(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}

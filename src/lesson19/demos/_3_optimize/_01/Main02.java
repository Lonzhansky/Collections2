package lesson19.demos._3_optimize._01;

// Бульбашкове сортування масиву.
// ОПТИМІЗАЦІЯ через переривання алгоритму,
// якщо внутрішній цикл не викликав перестановки.
// Часова складність O(N^2).
// Просторова (додаткова) складність O(1).
public class Main02 {

    public static void main(String[] args) {
        int[] data = new DataRepository().getData();
        System.out.println("Initial data:");
        getOutput(data);
        bubbleSort(data);
        System.out.println("Sorted data:");
        getOutput(data);
    }

    static void bubbleSort(int[] arr) {

        boolean isSwapped;
        int n = arr.length;

        // Сортування через вкладений for
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Перестановка
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            // ЯКЩО не було двох елементів, які
            // переставляються внутрішнім циклом,
            // тоді переривається.
            if (!isSwapped)
                break;
        }
    }

    private static void getOutput(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}

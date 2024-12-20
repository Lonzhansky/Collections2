package lesson19.demos._1_sorting._04_quick_sort;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {4, 5, 21, 7, 2, 8, 13, 3, 11, 6};
        getOutput(
                // Метод приймає як аргументи
                // початковий та кінцевий індекси масиву
                quickSort(arr, 0, arr.length - 1)
        );
    }

//    private static int[] getData() {
//        return new int[]{12, 7, 4, 5, 3, 2, 9, 10};
//    }

    private static int partition(int[] arr, int left, int right) {
        // Приймаємо перший елемент за основу
        int pivot = arr[left];
        // i - індекс, який має відстежувати найменші
        // елементи, ніж основа.
        // Поміняємо елемент із індексом i на основу.
        // Перед i-м індексом всі елементи мають бути
        // менше, ніж основа.
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (arr[j] < pivot) {
                // Знайдено менший елемент, що має збільшити i
                i++;
                // Змінюємо місцями елементи так, щоб
                // менший елемент помістити у правильну
                // позицію
                swap(arr, i, j);
            }
        }
        // Після того, як цикл for закінчується
        // до i-го індексу, менші елементи
        // були розміщені.
        // Тепер міняємо місцями індекс i із основою.
        swap(arr, i, left);

        return i;
    }

    private static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Ділимо масив основою
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void getOutput(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

}

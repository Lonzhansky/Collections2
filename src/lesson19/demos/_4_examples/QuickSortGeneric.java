package lesson19.demos._4_examples;

import java.util.Arrays;

// Реалізація алгоритму швидкого сортування (Quick Sort)
// з використанням узагальнення.
// Можна сортувати числа, рядки.
// Тут - сортування відповідно з природним порядком
// його елементів.
// Класи-оболонки та String внутрішньо реалізують
// інтерфейс Comparable.
//
// Продуктивність:
// Складність у найгіршому разі: O(N^2)
// Складність у найкращому разі: O(NlogN)
// Середня складність: O(NlogN)
// Складність простору у найгіршому випадку: O(1) допоміжна
public class QuickSortGeneric {

    public static void main(String[] args) {

        Integer[] intArr = {9, 4, 2, 13, 7, 3, 15};
        System.out.println("Initial int data: " +
                Arrays.toString(intArr));
        quickSort(intArr);
        System.out.println("Sorted int data: " +
                Arrays.toString(intArr));


        String[] stringArr = {"plum", "apple", "kiwi",
                "banana", "mango"};
        System.out.println("Initial string data: " +
                Arrays.toString(stringArr));
        quickSort(stringArr);
        System.out.println("Sorted string data: " +
                Arrays.toString(stringArr));
    }

    /**
     * Метод реалізує швидке сортування через узагальнення.
     *
     * @param array Масив для сортування
     * Сортує масив у порядку зростання
     **/
    private static <T extends Comparable<T>> void quickSort(T[] array) {
        doSort(array, 0, array.length - 1);
    }

    /**
     * Метод для заміни місць у масиві.
     *
     * @param arr - масив, де елементи переставляються.
     * @param idx1 - індекс першого елементу.
     * @param idx2 - індекс другого елементу.
     */
    private static <T> void swap(T[] arr, int idx1, int idx2) {
        T swap = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = swap;
    }

    /**
     * Метод перевіряє, чи менше перший елемент, ніж другий елемент
     *
     * @param a перший елемент
     * @param b другий елемент
     * @return true якщо перший елемент менший за другий елемент
     */
    private static <T extends Comparable<T>> boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    /**
     * Процес сортування
     *
     * @param left  Перший індекс масиву
     * @param right Останній індекс масиву
     * @param array Масив для сортування
     **/
    private static <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            doSort(array, left, pivot - 1);
            doSort(array, pivot, right);
        }
    }

    /**
     * Метод знаходить індекс розділу для масиву
     *
     * @param array Масив для сортування
     * @param left  Перший індекс масиву
     * @param right Останній індекс масиву
     **/
    private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        int mid = (left + right) / 2;
        T pivot = array[mid];

        while (left <= right) {
            while (less(array[left], pivot)) {
                ++left;
            }
            while (less(pivot, array[right])) {
                --right;
            }
            if (left <= right) {
                swap(array, left, right);
                ++left;
                --right;
            }
        }
        return left;
    }
}

package lesson19.demos._1_sorting.heap_sort;


public class HeapSort {

    public static void main(String[] args) {

        int[] numbers = {4, 5, 21, 7, 2, 8, 13, 3, 11, 6};

        heapSort(numbers);

        for (int number : numbers)
            System.out.print(number + " ");
    }

    // Сортування num[1] to num[n]
    public static void heapSort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            // Конвертація масиву в купу
            shiftDown(a, i, a.length);
        }
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i);
            shiftDown(a, 0, i);
        }
    }

    private static void shiftDown(int[] a, int i, int n) {
        int child;
        int tmp;

        for (tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && (a[child] < a[child + 1]))
                child++;
            if (tmp < a[child])
                a[i] = a[child];
            else
                break;
        }
        a[i] = tmp;
    }

    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    // swap (перестановка) елементів
    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}

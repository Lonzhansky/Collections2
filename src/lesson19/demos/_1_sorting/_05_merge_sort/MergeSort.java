package lesson19.demos._1_sorting._05_merge_sort;

public class MergeSort {

    public static void main(String[] args) {
        getOutput(mergeSort(getData(), 0,
                getData().length - 1));
    }

    private static int[] getData() {
        return new int[]{4, 5, 21, 7, 2, 8, 13, 3, 11, 6};
    }

    // Метод, який здійснює рекурсивні виклики для
    // сортування даних.
    // elements - це масив елементів сортування.
    // low – крайня ліва позиція масиву.
    // high - найправіша позиція масиву.
    private static int[] mergeSort(int[] elements, int low,
                                   int high) {
        // Список, що містить принаймні 2 елементи
        if (low < high) {
            int mid = (low + high) / 2;
            // Рекурсія: сортування першої половини
            mergeSort(elements, low, mid);
            // Рекурсія: сортування другої половини
            mergeSort(elements, mid + 1, high);
            // Об'єднання відсортованих половин
            merge(elements, low, mid, high);
        }
        return elements;
    }


    // Метод об'єднання відсортованого масиву елементів
    // від low до mid та mid+1.
    // low - найлівіше положення підмножини елементів.
    // high - найправіша позиція підмножини елементів.
    private static void merge(int[] subset, int low,
                              int mid, int high) {

        int n = high - low + 1;
        int[] temp = new int[n];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[k++] = subset[j++];
            } else if (j > high) {
                temp[k++] = subset[i++];
            } else if (subset[i] < subset[j]) {
                temp[k++] = subset[i++];
            } else {
                temp[k++] = subset[j++];
            }
        }
        for (j = 0; j < n; j++) {
            subset[low + j] = temp[j];
        }
    }

    private static void getOutput(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
    }
}

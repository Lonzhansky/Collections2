package lesson19.demos._2_searching._03_binary_search;

public class BinarySearchRecursive {

    public static void main(String[] args) {
        // Цільовий (ключовий) елемент
        int key = 12;
        // Нижній (початковий) індекс
        int low = 0;
        // Верхній (кінцевий) індекс
        int high = getData().length - 1;

        getOutput(search(getData(), key, low, high), key);
    }

    private static int[] getData() {
        // Відсортований масив
        return new int[]{2, 3, 3, 6, 8, 8, 12, 17, 23};
    }

    // Алгоритм пошуку. Повертає індекс.
    static int search(int[] sortedArray, int key,
                      int low, int high) {
        // Середній індекс
        int mid = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[mid]) {
            return mid;
        } else if (key < sortedArray[mid]) {
            // Рекурсивний виклик search()
            return search(sortedArray, key, low, mid - 1);
        } else {
            // Рекурсивний виклик search()
            return search(sortedArray, key, mid + 1, high);
        }
    }

    private static void getOutput(int index, int key) {
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element " + key +
                    " found at index " + index);
    }
}

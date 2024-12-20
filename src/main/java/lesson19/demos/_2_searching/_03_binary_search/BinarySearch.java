package lesson19.demos._2_searching._03_binary_search;

// Бінарний пошук.
// Метод search() приймає як аргументи
// відсортований масив (sortedArray), ключовий елемент (key).
// Метод використовує нижній (low) та верхній (high) індекси
// масиву.
// Коли метод запускається вперше, нижній індекс масиву
// дорівнює 0, а верхній індекс масиву дорівнює його довжині
// мінус 1.
// mid – це середній індекс (елемент) масиву.
// Алгоритм запускає цикл while, порівнюючи key зі
// значенням mid.
// Якщо цільовий елемент знайдено, повертається його індекс,
// інакше повертається -1.
public class BinarySearch {

    public static void main(String[] args) {
        int key = 12; // Цільовий (ключовий) елемент
        getOutput(search(getData(), key), key);
    }

    private static int[] getData() {
        // Відсортований масив
        return new int[]{2, 3, 3, 6, 8, 8, 12, 17, 23};
    }

    // Алгоритм пошуку
    private static int search(int[] sortedArray, int key) {
        // Нижній (початковий) індекс
        int low = 0;
        // Верхній (кінцевий) індекс
        int high = sortedArray.length - 1;

        while (low <= high) {
            // Середній індекс
            int mid = (low + high) / 2;

            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                return mid;
            }
        }
        return -1;
    }

    private static void getOutput(int index, int key) {
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element " + key +
                    " found at index " + index);
    }
}

package lesson19.demos._2_searching._02_linear_search;

// Рекурсивний лінійний пошук.
// Якщо розмір масиву дорівнює нулю, повернемо -1,
// тобто елемент не знайдено (базова умова
// рекурсивного виклику).
// Інакше перевіряємо, чи дорівнює елемент
// за поточним індексом у масиві значенню чи ні.
// Якщо дорівнює, то повертаємо індекс знайденого
// значення.
public class LinearSearchRecursive {

    public static void main(String[] args) {
        int n = 9; // <- шукаємо
        getOutput(n, search(getData(), getData().length, n));
    }

    private static int[] getData() {
        return new int[]{15, 8, 4, 9, 12, 23, 17};
    }

    // Алгоритм пошуку
    static int search(int[] arr, int size, int value) {
        if (size == 0) {
            return -1;
        // Перевіряємо, чи дорівнює елемент
        // за поточним індексом у масиві
        // значенню чи ні
        } else if (arr[size - 1] == value) {
            // Повертаємо індекс знайденого значення
            return size - 1;
        } else {
            // Рекурсивний виклик search()
            return search(arr, size - 1, value);
        }
    }

    private static void getOutput(int n, int index) {
        if (index != -1)
            System.out.println("Value " + n +
                    " is at index " + index);
        else
            System.out.println("Value " + n +
                    " is not found.");
    }
}

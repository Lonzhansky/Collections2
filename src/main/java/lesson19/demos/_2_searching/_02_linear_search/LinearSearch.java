package lesson19.demos._2_searching._02_linear_search;

// Лінійний пошук значення в масиві.
// Починаємо з індексу 0, порівнюємо з
// цільовим значенням.
// Якщо значення присутнє, повертається
// його індекс (місцезнаходження).
// Інакше повертається -1.
public class LinearSearch {

    public static void main(String[] args) {
        int n = 9; // <- шукаємо
        getOutput(n, search(getData(), n));
    }

    private static int[] getData() {
        return new int[]{15, 8, 4, 9, 12, 23, 17};
    }

    // Алгоритм пошуку
    private static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    private static void getOutput(int n, int index) {
        if (index == -1)
            System.out.print("Value is absent!");
        else
            System.out.print("Value " + n +
                    " is at index " + index);
    }
}

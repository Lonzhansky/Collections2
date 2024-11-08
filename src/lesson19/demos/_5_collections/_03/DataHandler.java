package lesson19.demos._5_collections._03;

import java.util.List;

public class DataHandler {

    public int search(List<Integer> list, int key) {
        // Нижній (початковий) індекс
        int low = 0;
        // Верхній (кінцевий) індекс
        int high = list.size() - 1;

        while (low <= high) {
            // Середній індекс
            int mid = (low + high) / 2;

            if (list.get(mid) < key) {
                low = mid + 1;
            } else if (list.get(mid) > key) {
                high = mid - 1;
            } else if (list.get(mid) == key) {
                return mid;
            }
        }
        return -1;
    }
}

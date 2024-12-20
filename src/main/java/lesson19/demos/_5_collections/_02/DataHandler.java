package lesson19.demos._5_collections._02;

import java.util.List;

public class DataHandler {
    // Алгоритм лінійного пошуку
    public int search(List<Integer> list, int x) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) return i;
        }
        return -1;
    }
}

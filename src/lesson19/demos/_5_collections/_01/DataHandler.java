package lesson19.demos._5_collections._01;

import java.util.List;

// Бульбашкове сортування в колекції.
public class DataHandler {

    public void sortData(List<Product> list) {

        Product temp;
        // boolean прапор переривання
        // алгоритму сортування якщо нема
        // потреби в перестановці
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                // Критерій - найменування
                if (list.get(i).getName().compareTo(list.get(i + 1)
                        .getName()) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
}

package lesson19.demos._5_collections._04._02;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataHandler {

    public int sortData(List<Product> list, double price) {

        // Зазначаємо компаратор
        Comparator<Product> comparator =
                Comparator.comparingDouble(Product::getPrice);

        // Пошук існуючого значення ціни
        // через Collections.binarySearch()
        // у списку об'єктів
        return Collections.binarySearch(list, new Product(null, price),
                comparator);
    }
}

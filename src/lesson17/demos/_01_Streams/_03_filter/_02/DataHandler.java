package lesson17.demos._01_Streams._03_filter._02;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class DataHandler {

    // Фільтруються вхідні дані та формується рядкове
    // представлення результату
    public String handleData(List<Employee> list) {

        AtomicInteger count = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();

        // Отримуємо вхідні данні
        Stream<Employee> allData = list.stream();
        // Фільтруємо вхідні данні
        Stream<Employee> filteredData = allData.filter(employee ->
                employee.getPhone().contains("96"));
        // Формуємо рядкове представлення
        // відфільтрованих даних
        filteredData.forEach(employee ->
                sb.append(count.getAndIncrement())
                        .append(") ").append(employee)
                        .append("\n"));

        return sb.toString();
    }
}

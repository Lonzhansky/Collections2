package lesson19.demos._5_collections._01;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        List<Product> list = repository.getData();
        getOutput(list);
        DataHandler handler = new DataHandler();
        handler.sortData(list);
        getOutput(list);
    }

    private static void getOutput(List<Product> list) {
        System.out.println("---------------------------");
        AtomicInteger count = new AtomicInteger(1);
        for (Product product : list) {
            System.out.println(count.getAndIncrement() + ") " +
                    product.getName() + ", price USD " +
                    product.getPrice());
        }
    }
}

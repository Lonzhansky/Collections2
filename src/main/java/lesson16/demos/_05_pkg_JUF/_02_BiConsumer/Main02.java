package lesson16.demos._05_pkg_JUF._02_BiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main02 {

    public static void main(String[] args) {
        getOutput(getData());
    }

    private static Map<String, Double> getData() {
        Map<String, Double> map = new HashMap<>();
        map.put("orange", 1.99);
        map.put("kiwi", 2.95);
        map.put("mango", 3.25);
        map.put("apple", 1.97);
        return map;
    }

    private static void getOutput(Map<String, Double> map) {
        BiConsumer<String, Double> biConsumer = (name, price) ->
                System.out.println("Product " + name
                        + ", price is USD " + price);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }
}

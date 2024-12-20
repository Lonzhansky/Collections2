package lesson18.demos._06_filter._03;

import java.util.Optional;

public class Main02 {

    public static void main(String[] args) {

        // Вхідне значення не дуже чисте
        String result = " orange ";

        // Фільтрація без Optional
        if (result != null && result.contains("orange")) {
            System.out.println("Data: " + result);
        }

        // Фільтрація з Optional, додавання map()
        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(res -> res.contains("orange"))
                .map(String::trim)
                .ifPresent((res) ->
                        System.out.println("Data: " + res));
    }
}

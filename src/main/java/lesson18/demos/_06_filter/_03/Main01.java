package lesson18.demos._06_filter._03;

import java.util.Optional;

public class Main01 {

    public static void main(String[] args) {

        // Вхідне значення
        String data = "orange";

        // Фільтрація без Optional
        if (data != null && data.contains("orange")) {
            System.out.println("1) Data: " + data);
        }

        // Фільтрація з Optional
        Optional<String> optionalStr = Optional.of(data);
        optionalStr
                .filter(data1 ->
                        data1.contains("orange"))
                .ifPresent((res) ->
                        System.out.println("2) Data: " + res));

    }
}

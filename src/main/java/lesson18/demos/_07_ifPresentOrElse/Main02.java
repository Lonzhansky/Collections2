package lesson18.demos._07_ifPresentOrElse;

import java.util.Optional;

public class Main02 {

    public static void main(String[] args) {

        Optional<Integer> optional = Optional.of(12);
        optional.ifPresentOrElse(x ->
                        System.out.println("1) Data: " + x),
                () -> System.out.println("1) No data."));

        Optional<Integer> optional1 = Optional.empty();
        optional1.ifPresentOrElse(x ->
                        System.out.println("2) Data: " + x),
                () -> System.out.println("2) No data."));
    }
}

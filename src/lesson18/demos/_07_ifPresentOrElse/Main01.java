package lesson18.demos._07_ifPresentOrElse;

import java.util.Optional;

public class Main01 {

    public static void main(String[] args) {

//        Optional<String> optional = Optional.of("Orange");
        Optional<String> optional = Optional.empty();

        // Java 8 style

        if (optional.isPresent()) {
            System.out.println("1) Product: " + optional.get());
        } else {
            System.out.println("1) No data.");
        }

        optional.ifPresent(prod ->
                System.out.println("2) Product: " + prod));

        // Java 9 style
        optional.ifPresentOrElse(
                prod ->
                        System.out.println("3) Product: " + prod),
                () ->
                        System.out.println("3) No data.")
        );
    }
}

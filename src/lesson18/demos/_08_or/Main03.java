package lesson18.demos._08_or;

import java.util.Optional;
// https://docs.oracle.com/javase/9/docs/api/java/util/function/Supplier.html
import java.util.function.Supplier;

public class Main03 {

    public static void main(String[] args) {

        Optional<String> optional1 = Optional.of("Orange");

        Supplier<Optional<String>> supplier = () ->
                Optional.of("No data.");

        optional1 = optional1.or(supplier);
        optional1.ifPresent(n ->
                System.out.println("1) Data: " + n));

        optional1 = Optional.empty();

        optional1 = optional1.or(supplier);
        optional1.ifPresent(n ->
                System.out.println("2) Data: " + n));
    }
}

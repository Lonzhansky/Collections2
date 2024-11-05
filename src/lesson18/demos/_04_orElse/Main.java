package lesson18.demos._04_orElse;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<String> optional1 = Optional.of("Orange");
        Optional<String> optional2 = Optional.empty();

        System.out.println("1) " + optional1.orElse(getDefaultData()));
        System.out.println("2) " + optional2.orElse(getDefaultData()));

        System.out.println("3) " + optional1.orElseGet(() ->
                getDefaultData()));
        System.out.println("4) " + optional2.orElseGet(() ->
                getDefaultData()));
    }

    public static String getDefaultData() {
        System.out.println("getDefaultData() invoked");
        return "Apple";
    }
}

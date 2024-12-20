package lesson18.demos._05_map_flatMap;

import java.util.Optional;

// map() повертає результат методу toLowerCase(),
// загорнутий у Optional, якщо є значення.
// В іншому випадку він повертає порожній Optional.
// Він працює інакше, ніж flatMap(), тобто map() перетворює
// значення лише тоді, коли вони розгорнуті, тоді як flatMap()
// приймає загорнуте значення та розгортає його перед перетворенням.
public class Main {

    public static void main(String[] args) {

        Optional<String> optional1 = Optional.of("Orange");
        Optional<String> optional2 = Optional.empty();

        System.out.println("1) map(): " + optional1.map(String::toLowerCase));
        System.out.println("2) map(): " + optional2.map(String::toLowerCase));

        Optional<Optional<String>> optional3 = Optional.of(
                Optional.of("Cherry")
        );

        System.out.println("3) map(): " +
                optional3.map(
                        str -> str.map(String::toUpperCase)
                )
        );

        System.out.println("4) flatMap(): " +
                optional3.flatMap(
                        str -> str.map(String::toLowerCase)
                )
        );
    }
}


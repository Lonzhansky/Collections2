package lesson18.demos._03_present;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Alice", 25);

        // ofNullable() повертає Optional, що описує надане значення,
        // якщо воно відмінне від null, інакше повертає порожній Optional
        Optional<Person> optional1 = Optional.ofNullable(person);
        Optional<Person> optional2 = Optional.ofNullable(null);

        // Метод isPresent() повертає логічне значення залежно
        // від наявності значення.
        // Якщо значення присутнє, воно повертає true, інакше false.
        // Однак використання isPresent подібне до виконання ручних
        // null перевірок за допомогою if-else, тому це не рекомендоване
        // використання Optional.
        // ifPresent() робить код коротшим і більш читабельним.

        System.out.println("1) isPresent()");
        if (optional1.isPresent()) {
            // get() може отримати значення з об’єкта Optional.
            // get() викличе NoSuchElementException,
            // якщо Optional порожній
            System.out.println(optional1.get());
        } else {
            System.out.println("No person stored");
        }

        System.out.println("2) isPresent()");
        if (optional2.isPresent()) {
            System.out.println(optional2.get());
        } else {
            System.out.println("No person stored");
        }

        // ifPresent() виводить обгорнуте значення, якщо воно присутнє,
        // інакше жодних дій не виконується
        System.out.println("3) ifPresent()");
        optional1.ifPresent(System.out::println);

        // Лямбда-вираз типу Consumer в ifPresent()
        System.out.println("4) ifPresent()");
        optional1.ifPresent(
                p -> System.out.println("The name is " + p.getName())
        );

        // Жодних дій не виконується
        System.out.println("5) ifPresent()");
        optional2.ifPresent(System.out::println);
    }
}

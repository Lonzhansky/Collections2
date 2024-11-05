package lesson18.demos._02_create;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        // Створюємо порожній Optional.
        // Краще Optional.empty() для ініціалізації Optional
        // замість null значення.
        // Optional — це просто контейнер, тому недоцільно
        // ініціалізувати його null.
        Optional<Person> optional1 = Optional.empty();
//        Optional<Person> optional1 = null;

        System.out.println("1) Data: " + optional1);

        // to create an Optional from non-null value
        // this will throw an NPE if the null value provided

        // Створення Optional з non-null значення.
        Person person = new Person("Alice", 25);
        Optional<Person> optional2 = Optional.of(person);
        // Викличе NPE, якщо вказано null значення
//        Optional<Person> optional2 = Optional.of(null);
        System.out.println("2) Data: " + optional2);

        // Створення Optional з можливо null значення
        Optional<Person> optional3 = Optional.ofNullable(null);
        Optional<Person> optional4 = Optional.ofNullable(person);
        System.out.println("3) Data: " + optional3);
        System.out.println("4) Data: " + optional4);
    }
}

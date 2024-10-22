package lesson16.demos._05_pkg_JUF._03_Supplier._02;

import java.time.LocalDate;
import java.util.function.Supplier;

// Можемо отримати поточну дату через метод get()
// інтерфейсу Supplier.
// Поточна дата може знадобитися в різних
// місцях додатку.
public class Main {

    public static void main(String[] args) {
        Supplier<LocalDate> currentDate = () -> LocalDate.now();
        System.out.println("The current date is " + currentDate.get());
    }
}

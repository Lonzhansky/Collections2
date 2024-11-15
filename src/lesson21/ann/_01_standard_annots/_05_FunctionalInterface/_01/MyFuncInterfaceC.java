package lesson21.ann._01_standard_annots._05_FunctionalInterface._01;

// Використовуємо анотацію @FunctionalInterface,
// щоб переконатися, що функціональний інтерфейс
// має лише один абстрактний метод.
// ОДНАК у нього може бути будь-яка кількість default
// та static методів, які мають реалізацію.
@FunctionalInterface
public interface MyFuncInterfaceC {

    // Абстрактний метод
    void getInfo();

    default void getData() {
        System.out.println("Data.");
    }

    default void getSomeData() {
        System.out.println("Some data.");
    }

    static void getMessage() {
        System.out.println("This is static method!");
    }
}

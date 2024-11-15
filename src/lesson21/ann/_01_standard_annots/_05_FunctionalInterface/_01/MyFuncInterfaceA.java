package lesson21.ann._01_standard_annots._05_FunctionalInterface._01;

// Java 8 вперше представила анотацію @FunctionalInterface.
// Ця анотація показує, що оголошення типу, у якому вона
// використовується, є функціональним інтерфейсом.
@FunctionalInterface
public interface MyFuncInterfaceA {
    // Один абстрактний метод
    void getInfo();
}

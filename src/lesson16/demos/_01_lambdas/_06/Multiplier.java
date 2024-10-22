package lesson16.demos._01_lambdas._06;

// Інтерфейс із default методом
// НЕ розглядається як функціональний інтерфейс,
// НЕ може використовуватись для лямбда-виразу.
public interface Multiplier {

    default int multiply(int a, int b) {
        return a * b;
    }
}

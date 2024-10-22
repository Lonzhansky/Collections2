package lesson16.demos._01_lambdas._01;

// Лямбда-вираз без параметрів
public class Main {

    public static void main(String[] args) {
        IDisplay data = () -> "No data.";
        String output = data.display();
        System.out.println("Output: " + output);
    }
}

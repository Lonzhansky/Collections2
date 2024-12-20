package lesson16.demos._01_lambdas._07;

// Лямбда-вираз без параметрів
public class Main {

    public static void main(String[] args) {
        String name = "Tom";
        IDisplay data = () ->
                System.out.println("Name is " + name);
        data.display();
    }
}

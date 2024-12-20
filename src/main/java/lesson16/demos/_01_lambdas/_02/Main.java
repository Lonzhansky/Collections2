package lesson16.demos._01_lambdas._02;

// Лямбда-вираз з одним параметром
public class Main {

    static String name;
    static Outputer outputer;
    static String output;

    public static void main(String[] args) {

        name = "Tom";
        // Один параметр у дужках
        outputer = (name) -> "Name is " + name;
        output = outputer.getOutput(name);
        System.out.println(output);

        name = "Alice";
        // Якщо є тільки один параметр, можливо без дужок
        outputer = name -> "Name is " + name;
        output = outputer.getOutput(name);
        System.out.println(output);

        name = "Alice";
        // Якщо є тільки один параметр, можливо без дужок
        outputer = name -> "Name is " + name.toUpperCase();
        output = outputer.getOutput(name);
        System.out.println(output);
    }
}

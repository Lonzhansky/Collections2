package lesson16.demos._02_methods_ref._02;

// Посилання на метод на статичний метод класу
public class Main {

    static String name;
    static IDisplay data;

    public static void main(String[] args) {
        name = "Tom";
        // Посилання на статичний метод
        data = Main::displayData;
        // Виклик методу інтерфейсу
        data.display(name);
    }

    public static void displayData(String name) {
        System.out.println("Name is " + name);
    }
}

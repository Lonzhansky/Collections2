package lesson16.demos._02_methods_ref._01;

// Посилання на метод для екземпляра методу об'єкту
public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        // Посилання на метод із використанням об'єкта класу
        IDisplay iDisplay = obj::showData;
        // Виклик методу функціонального інтерфейсу
        iDisplay.display();
    }

    private void showData() {
        System.out.println("Just info.");
    }
}

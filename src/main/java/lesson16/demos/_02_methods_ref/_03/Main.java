package lesson16.demos._02_methods_ref._03;

// Посилання на нестатичні методи.
// Можемо посилатися на методи по об'єкту класу
// та анонімному об'єкту.
public class Main {

    static IDisplay iDisplay;

    public static void main(String[] args) {

        Main main = new Main();
        // Посилаємося на нестатичний метод через посилання
        iDisplay = main::showData;
        // Виклик методу інтерфейсу
        iDisplay.display();

        // Посилаємося на нестатичний метод через
        // анонімний об'єкт
        iDisplay = new Main()::showData;
        // Виклик методу інтерфейсу
        iDisplay.display();
    }

    public void showData() {
        System.out.println("Just data.");
    }
}

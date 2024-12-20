package lesson26._02.solid.demos._5_dependency_inversion.good;

public class App {

    // Посилання на абстрактну реалізацію Printer
    static Printer printer;

    public static void main(String[] args) {

        String text = "Some super text ...";
        // Конкретна реалізація LaserPrinter
        LaserPrinter laserPrinter = new LaserPrinter();
        laserPrinter.print(text);

        printer = new LaserPrinter();
        // Конкретна реалізація OfficePrinter, яка
        // не залежить від іншої конкретної реалізації - LaserPrinter,
        // а сполучається з нею через абстрактну реалізацію Printer.
        OfficePrinter officePrinter = new OfficePrinter(printer);
        printer.print(text);
        officePrinter.printFile();
    }
}

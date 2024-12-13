package lesson26._02.solid.demos._5_dependency_inversion.good;

public class OfficePrinter {

    private final Printer printer;

    public OfficePrinter(Printer printer) {
        this.printer = printer;
    }

    public void printFile() {
        printer.print("File content ...");
    }

}

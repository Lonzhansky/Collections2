package lesson16.demos._05_pkg_JUF._01_Consumer._02;

public class Main {

    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        handler.handleData(
                new DataProvider().getData(),
                handler.getConsumer()
        );
    }
}

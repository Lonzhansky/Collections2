package lesson17.demos._01_Streams._03_filter._02;

public class App {

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.handleData(repository.getData()));
    }
}

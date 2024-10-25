package lesson17.demos._02_Streams_Parallel._02;

public class Main {

    public static void main(String[] args) {

        DataRepository provider = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        String category = "fruits";

        uiOperator.getOutput(
                handler.formOutput(
                        category,
                        handler.handleData(provider.getData(), category)
                )
        );
    }
}

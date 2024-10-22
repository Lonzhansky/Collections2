package lesson16.demos._02_methods_ref._05;

// Посилання методу на конструктор
public class Main {

//    static IDisplay iDisplay;
//    static String output;

    public static void main(String[] args) {
//        output = "Super info!";
//        iDisplay = new IDisplay() {
//            @Override
//            public void display(String info) {
//                new Indicator(info);
//            }
//        };
//        iDisplay = info -> new Indicator(info);
//        iDisplay = Indicator::new;
//        iDisplay.display("Super info!");



        IDisplay iDisplay = Indicator::new;
        iDisplay.display("Super info!");
    }
}

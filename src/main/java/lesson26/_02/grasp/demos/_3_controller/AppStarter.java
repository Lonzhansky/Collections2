package lesson26._02.grasp.demos._3_controller;

public class AppStarter {

    public void startApp() {
        ProductView view = new ProductView();
        ProductModel model = new ProductModel();
        ProductController controller = new ProductController(view, model);
        controller.runApp();
    }
}

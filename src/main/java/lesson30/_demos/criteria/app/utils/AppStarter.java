package lesson30._demos.criteria.app.utils;

import lesson30._demos.criteria.app.controller.AppController;
import lesson30._demos.criteria.app.service.AppService;
import lesson30._demos.criteria.app.view.AppView;

public class AppStarter {

    public static void startApp() {
        AppService service = new AppService();
        AppView view = new AppView();
        AppController controller = new AppController(view, service);
        controller.runApp();
    }
}

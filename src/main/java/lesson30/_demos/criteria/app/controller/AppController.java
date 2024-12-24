package lesson30._demos.criteria.app.controller;

import lesson30._demos.criteria.app.service.AppService;
import lesson30._demos.criteria.app.view.AppView;

public class AppController {

    AppView view;
    AppService service;

    public AppController(AppView view, AppService service) {
        this.view = view;
        this.service = service;
    }

    public void runApp() {
        service.filterChoice(view.chooseOption());
    }
}

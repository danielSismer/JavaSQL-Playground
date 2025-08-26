package code.exercises.application.main;

import code.exercises.application.service.ApplicationService;
import code.exercises.application.view.ApplicationView;

public class Main {

    public static void main (String [] args ){

        ApplicationService applicationService = new ApplicationService();
        ApplicationView applicationView = new ApplicationView();

        int mainKey = applicationView.mainCategory();
        int mainOperation = applicationView.mainOperation();
        applicationService.mainMenu(mainKey, mainOperation, applicationView);
    }
}

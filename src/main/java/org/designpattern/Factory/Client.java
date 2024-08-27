package org.designpattern.Factory;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.ANDROID);

        //UIFactory -> AndroidFactory
        Button button = uiFactory.createButton();
        button.showButton();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}

package org.designpattern.Factory;

public interface UIFactory {
    //This is the factory interface contains all the factory methods for flutter class
    public Button createButton();
    public Menu createMenu();

}

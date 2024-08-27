package org.designpattern.Factory;

public class IOSButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing IOS Button");
    }
}

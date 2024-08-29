package org.designpattern.Adapter;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        PhonePe pp = new PhonePe(new YesBankAPIAdapter());
        System.out.println(pp.doSomething());
    }
}

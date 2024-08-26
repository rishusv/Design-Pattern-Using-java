package org.designpattern.Singleton;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(new TargetForT1());
        Thread t2= new Thread(new TargetForT2());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

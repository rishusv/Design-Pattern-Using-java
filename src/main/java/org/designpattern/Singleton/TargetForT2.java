package org.designpattern.Singleton;

public class TargetForT2 implements Runnable{
    private DbConn ref;
    @Override
    public void run() {
        DbConn db2= DbConn.getInstance();
        this.ref=db2;
        System.out.println(ref);
        System.out.println("Target T2");

    }
}

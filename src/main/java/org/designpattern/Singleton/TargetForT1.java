package org.designpattern.Singleton;

public class TargetForT1 implements Runnable{
    private DbConn ref;
    @Override
    public void run() {
        DbConn db1= DbConn.getInstance();
        this.ref=db1;
        System.out.println(ref);
        System.out.println("Target T1");
    }
}

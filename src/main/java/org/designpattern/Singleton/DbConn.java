package org.designpattern.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConn {
    private static DbConn inst;
    private static Lock lock= new ReentrantLock();
    private DbConn(){}
    public static DbConn getInstance(){
        if(inst == null){
            lock.lock();
            inst = new DbConn();
            lock.unlock();
        }
        return inst;
    }
}

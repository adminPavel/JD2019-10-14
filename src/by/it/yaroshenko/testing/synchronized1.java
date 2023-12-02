package by.it.yaroshenko.testing;

import java.util.concurrent.locks.Lock;

public class synchronized1 implements Runnable{
    @Override
    public void run() { Lock(); }
    public static void Lock () {
        synchronized (synchronized1.class) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block "+ Thread.currentThread().getName() + " end");
        }
    }
    public static void main(String[] args) {
        synchronized1 obj1 = new synchronized1();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj1);
        synchronized1 obj2 = new synchronized1();
        Thread t3 = new Thread(obj2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();
    }
}

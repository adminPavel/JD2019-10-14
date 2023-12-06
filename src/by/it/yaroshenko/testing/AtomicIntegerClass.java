package by.it.yaroshenko.testing;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerClass {
    AtomicInteger count = new AtomicInteger();

    public void increment() {
        System.out.println(count.incrementAndGet()+" ");
    }
}
class GFG8{
    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerClass a = new AtomicIntegerClass();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 2000; i++) {
                    a.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 2000; i++) {
                    a.increment();
                }
            }
        });
        t1.start();
        t2.start();
       // t1.join();
        //t2.join();
    }
}


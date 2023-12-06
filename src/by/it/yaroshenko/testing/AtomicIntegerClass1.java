package by.it.yaroshenko.testing;

import java.util.concurrent.atomic.AtomicInteger;

class Method extends Thread {
   // int count = 0;
    AtomicInteger count;
    Method(){
        count = new AtomicInteger();
    }
    public synchronized void run() {
        int max = 100_000_000;
        for (int i = 0; i < max; i++) {
            count.addAndGet(1);
        }
    }
}
    public class AtomicIntegerClass1 {
    public static void main(String[] args) throws Exception {
        Method obj1 = new Method();
        Thread first = new Thread(obj1, "First");
        Thread second = new Thread(obj1, "Second");
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println(obj1.count);
    }
}

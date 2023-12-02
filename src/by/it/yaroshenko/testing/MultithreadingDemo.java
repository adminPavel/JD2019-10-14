package by.it.yaroshenko.testing;

import java.lang.reflect.Executable;

public class MultithreadingDemo extends Thread{
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().threadId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
    class Multithread {
        public static void main(String[] args) {
        int n =8;
            for (int i = 0; i < n; i++) {
            MultithreadingDemo obj = new MultithreadingDemo();
            obj.start();
            }
        }
    }


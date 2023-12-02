package by.it.yaroshenko.testing;

public class MultithreadingDemo1 extends Thread {

    public void run() {
        System.out.println("Thread1 is running");
    }
    public void show() {
        System.out.println("Thread 1");
    }
}
class MultithreadingDemo2 extends Thread{
    public void run() {
        System.out.println("Thread2 is running");
    }
    public void show() {
        System.out.println("Thread 2");
    }
}
class MultithreadingDemo3 extends Thread{
    public void run() {
        System.out.println("Thread3 is running");
    }
    public void show() {
        System.out.println("Thread 3");
    }
}
class GFG5 {
    public static void main(String[] args) {
        MultithreadingDemo3 mult3 = new MultithreadingDemo3();
        MultithreadingDemo1 mult1 = new MultithreadingDemo1();
        MultithreadingDemo2 mult2 = new MultithreadingDemo2();
        mult3.start();
        mult1.start();
        mult2.start();
        mult3.show();
        mult1.show();
        mult2.show();
        
    }
}

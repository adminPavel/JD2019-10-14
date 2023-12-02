package by.it.yaroshenko.testing;

class MyThread extends Thread{
    int count = 0;
    void increment(){count++;}
    public void run() {
            increment();
            System.out.println("Count : " + count);
    }
}
public class Multithreading9 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

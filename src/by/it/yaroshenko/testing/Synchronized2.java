package by.it.yaroshenko.testing;

class A{
    synchronized void sum (int n) {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName() + " : " + (n+i));
        }
    }
}
class B2 extends Thread {
    A a = new A();
    public void run() {
        a.sum(10);
    }
}
public class Synchronized2 {
    public static void main(String[] args) {
            B2 b2 = new B2();
            Thread t1 = new Thread(b2);
            Thread t2 = new Thread(b2);
            t1.setName("Thread A");
            t2.setName("Thread B");
            t1.start();
            t2.start();
    }
}

package by.it.yaroshenko.testing;

class Geek1 extends Thread{
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()+ "...starts");
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ "...notified");
        }
    }
}
class Geek2 extends Thread {
    Geek1 geek1;
    Geek2(Geek1 geek1) {
        this.geek1 = geek1;
    }
    public void run() {
        synchronized (this.geek1) {
            System.out.println(Thread.currentThread().getName()+ "...starts");
            try {
                this.geek1.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ "...notified");
        }
    }
}
class Geek3 extends Thread{
    Geek1 geek1;
    Geek3 (Geek1 geek1) {
        this.geek1 = geek1;
    }
    public void run() {
        synchronized (this.geek1) {
            System.out.println(
                    Thread.currentThread().getName()
                            + "...starts");
            this.geek1.notify();
            System.out.println(
                    Thread.currentThread().getName()
                            + "...notified");
        }
    }
}

public class NotifyAndNotifyAll {
    public static void main(String[] args) throws InterruptedException {
    Geek1 g1 = new Geek1();
    Geek2 g2 = new Geek2(g1);
    Geek3 g3 = new Geek3(g1);
    Thread t1 = new Thread(g1, "Thread-1");
    Thread t2 = new Thread(g2, "Thread-2");
    Thread t3 = new Thread(g3, "Thread-3");
    t1.start();
    t2.start();
    Thread.sleep(100);
    t3.start();
    }
}

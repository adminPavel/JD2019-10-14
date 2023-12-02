package by.it.yaroshenko.testing;

public class DaemonThread1 extends Thread{
        public void run(){
            System.out.println("Thread name : " + Thread.currentThread().getName());
            System.out.println("Check if its DaemonThread: " + Thread.currentThread().isDaemon());
        }
    public static void main(String[] args) {
        DaemonThread1 t1 = new DaemonThread1();
        DaemonThread1 t2 = new DaemonThread1();
        t1.setDaemon(true);

        t1.start();
        t2.start();
    }
}

package by.it.yaroshenko.testing;

class Shot4 extends Thread{
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("I am daemon thread and I am working " + Thread.currentThread().getPriority());
        } else {
            System.out.println("I am user thread and I am working " + Thread.currentThread().getPriority());
        }
    }
}
public class Multithreading8 {
    public static void main(String[] args) {
        Shot4 obj1 = new Shot4();
        Shot4 obj2 = new Shot4();
        Shot4 obj3 = new Shot4();
        obj2.setDaemon(true);

        obj1.start();
        obj2.start();
        obj3.start();
    }
}

package by.it.yaroshenko.testing;

class ThreadJoining extends Thread{
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: " + currentThread().getName());
            } catch (Exception e) {
                System.out.println("Exception has" +
                        " been caught" + e);
            }
            System.out.println(i);
        }
    }
}
public class Multitreading11 {
    public static void main(String[] args) {
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();
        t1.start();
        try {
            System.out.println("Current Thread1: " +
                    Thread.currentThread().getName());
            t1.join();
        } catch (Exception e) {
            System.out.println("Exception has " +
                    "been caught" + e);
        }
        t2.start();
        try {
            System.out.println("Current Thread2: " +
                    Thread.currentThread().getName());
            t2.join();
        } catch (Exception e) {
            System.out.println("Exception has " +
                    "been caught" + e);
        }
        t3.start();
    }
}

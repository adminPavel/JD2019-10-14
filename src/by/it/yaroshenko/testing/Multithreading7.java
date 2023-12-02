package by.it.yaroshenko.testing;

class Shot3 extends Thread {
    public void run() {
        System.out.println("Running Thread : "
                + currentThread().getName());
        System.out.println("Running Thread Priority : " + currentThread().getPriority());
    }
}
public class Multithreading7 {
    public static void main(String[] args) {
        Shot3 obj1 = new Shot3();
        Shot3 obj2 = new Shot3();
        Shot3 obj3 = new Shot3();
        Shot3 obj4 = new Shot3();
        Shot3 obj5 = new Shot3();
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
    }
}

package by.it.yaroshenko.testing;

public class ObjectLevelLockinJava implements Runnable{
        public void run() { Lock(); }

    private void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block "+ Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args) {
    ObjectLevelLockinJava obj1 = new ObjectLevelLockinJava();
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj1);
        ObjectLevelLockinJava obj2 = new ObjectLevelLockinJava();
        Thread t3 = new Thread(obj2);

    t1.setName("t1");
    t2.setName("t2");
    t3.setName("t3");
    t1.start();
    t2.start();
    t3.start();
    }
}

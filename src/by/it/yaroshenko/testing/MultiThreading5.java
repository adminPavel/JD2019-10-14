package by.it.yaroshenko.testing;

class Shot1 extends Thread{
    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Shot1");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }
    }
}
    class Miss1 extends Thread{
        public void show() {
            for (int i = 0; i < 5; i++) {
            System.out.println("Miss1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
}

public class MultiThreading5 {
    public static void main(String[] args) {
        Shot1 obj1 = new Shot1();
        Miss1 obj2 = new Miss1();
        obj1.start();
        obj2.start();
        obj1.show();
        obj2.show();
    }
}

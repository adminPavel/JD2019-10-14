package by.it.yaroshenko.testing;

class Shot2 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Shot");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Miss2 extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Miss");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Multithreading6 {
    public static void main(String[] args) {
        Shot2 obj1 = new Shot2();
        Miss2 obj2 = new Miss2();
        obj1.start();
        obj2.start();
    }
}

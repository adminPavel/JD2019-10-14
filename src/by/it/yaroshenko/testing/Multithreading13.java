package by.it.yaroshenko.testing;

class TikTok2 {
    int count;
    public void increment() {
        System.out.println(count++);
    }
}
public class Multithreading13 {
    public static void main(String[] args) throws Exception{
        TikTok2 tt = new TikTok2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    tt.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    tt.increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println();
        System.out.println("Count : " + tt.count);
    }
}

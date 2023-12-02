package by.it.yaroshenko.testing;
class TikTok1 {
    int count;
    public void increment() {
        System.out.println(count++);

    }
}
public class Multithreading12 {
    public static void main(String[] args) throws Exception{
        TikTok1 tt = new TikTok1();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    tt.increment();
                }
            }
        });
        t1.start();
        t1.join();
        System.out.println("Count : " + tt.count);

    }
}

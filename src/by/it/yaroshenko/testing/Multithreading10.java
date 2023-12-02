package by.it.yaroshenko.testing;

import java.sql.SQLOutput;

class TikTok {
    int count;
    public void increment () {
        System.out.print(count++);

    }
}
public class Multithreading10 {
    public static void main(String[] args) {
        TikTok tt = new TikTok();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    tt.increment();

                }
            }
        });
        t1.start();
        System.out.println();
        System.out.println("Count: " + tt.count);
    }
}

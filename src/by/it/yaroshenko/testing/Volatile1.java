package by.it.yaroshenko.testing;

public class Volatile1 {
    static volatile int a = 0, b = 0;
    static void methodOne() {
        a++;
        b++;
    }
    static void methodTwo() {
        System.out.println("a = " + a + "b = " + b);
    }
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run () {
                for (int i = 0; i < 5; i++) {
                    methodOne();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run () {
                for (int i = 0; i < 5; i++) {
                    methodTwo();
                }
            }
        };
        t1.start();
        t2.start();
    }
}

package by.it.yaroshenko.testing;

public class Display {
    public void wish(String name) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Good morning");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(name);
        }
    }
}

class myThread extends Thread {
           Display d;
           String name;

           public myThread(Display d, String name) {
               this.d = d;
               this.name = name;
           }
            public void run() {
                d.wish(name);
            }
        }

         class myThread1 extends Thread {
            Display1 d1;
            String name;
            public myThread1(Display1 d1, String name) {
                this.d1 = d1;
                this.name = name;
            }
            public void run() {
                d1.wish(name);
            }
        }
class Display1 {
    public void wish(String name) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Good morning1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(name);
        }
    }
}
        class GFG6 {
        public static void main(String[] args) {
            Display d = new Display();
            Display1 d1 = new Display1();
            myThread t1 = new myThread(d, "Djoni");
            myThread t2 = new myThread(d, "Ivan");
            myThread1 t3 = new myThread1(d1, "YYYYYYY");
            t1.start();
            t2.start();
            t3.start();
        }
    }


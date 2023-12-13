package by.it.yaroshenko.testingNew1;

import java.io.FileNotFoundException;

public class Multithreading2 {
    private class RunnableImp implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()
                    + ", executing run() method!");
            try {
                throw new FileNotFoundException();
            }
            catch (FileNotFoundException e) {
                System.out.println("Must catch here!");
                e.printStackTrace();
            }

             int r = 1 / 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Main thread is- "
                + Thread.currentThread().getName());
        Thread thread = new Thread(new Multithreading2().new RunnableImp());
        thread.start();
    }
}

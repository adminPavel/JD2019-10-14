package by.it.yaroshenko.testingNew1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);
        CountDownLatch cd5 = new CountDownLatch(5);

        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println("Starting");
        // Executing the tasks
        es.execute(new MyThread(cd1, "A"));
        es.execute(new MyThread(cd2, "B"));
        es.execute(new MyThread(cd3, "C"));
        es.execute(new MyThread(cd4, "D"));

        // Try block to check for exceptions
        try {

            // Waiting for tasks to complete
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        }

        // Catch block to handle exceptions
        catch (InterruptedException e) {

            System.out.println(e);
        }

        // Making all current executing threads to terminate
        es.shutdown();

        // Display message only for better readability
        System.out.println("Done");
    }
}
class MyThread implements Runnable {
        String name;
        CountDownLatch latch;
        MyThread (CountDownLatch latch, String name) {
            this.latch = latch;
            this.name = name;
            new Thread(this);
        }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
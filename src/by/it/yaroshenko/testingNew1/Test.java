package by.it.yaroshenko.testingNew1;

 class MultiThreading implements Runnable{
    public void run() {
        try {
            System.out.println("thread2 going to sleep for 5000");
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            // Print statement
            System.out.println("Thread2 interrupted");
        }
    }

}
    public class Test implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread-2");
    }
    public static void main(String[] args) {
        Test test = new Test();
        MultiThreading multiThreading = new MultiThreading();
        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(multiThreading);
        thread1.start();
        thread2.start();

        ClassLoader loader = thread1.getContextClassLoader();
        Thread thread3 = new Thread(new MultiThreading());
        System.out.println(Thread.activeCount());

    }


}


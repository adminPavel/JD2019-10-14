package by.it.yaroshenko.testing;

class Sender {
    public  void send(String msg) {
        System.out.println("Sending\\t" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n" + msg + "Sent");
    }
}
class ThreadedSend extends Thread {
    private String msg;
    final Sender sender;
    ThreadedSend (String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }
    public void run () {
        synchronized (sender) {
            sender.send(msg);
        }
    }
}
public class Multithreading15 {
    public static void main(String[] args) throws Exception {
        Sender sender = new Sender();
        ThreadedSend s1 = new ThreadedSend("Hello ", sender);
        ThreadedSend s2 = new ThreadedSend("Bye ", sender);
        s1.start();
        s2.start();
        //s1.join();
        //s2.join();
    }
}

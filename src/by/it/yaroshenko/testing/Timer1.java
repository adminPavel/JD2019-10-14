package by.it.yaroshenko.testing;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.junit.Test;

public class Timer1 {


    public static void main(String[] args) throws Exception{
        Timer1 t1 = new Timer1();
        t1.givenUsingTimer_whenSchedulingTaskOnce_thenCorrect();
    }

    @Test
    public void givenUsingTimer_whenSchedulingTaskOnce_thenCorrect() {
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Task performed on: " + new Date() + "n" +
                        "Thread's name: " + Thread.currentThread().getName());
            }
        };
        Timer timer = new Timer("Timer");

        long delay = 1L;
        try {
            Thread.sleep(delay * 2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        timer.schedule(task, delay);
    }
}

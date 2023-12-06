package by.it.yaroshenko.testing;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.*;

public class Volatile2 {
     private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

     private static  int MY_INT = 0;

    static class ChangeListener extends Thread {
        public void run() {
            int local_value = MY_INT;
            while (local_value <5) {
                if(local_value != MY_INT) {
                    LOGGER.log(Level.INFO, "Got Change for MY_INT : {0}", MY_INT);
                    local_value = MY_INT++;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
         }
        }
    }
    static class ChangeMaker extends Thread {
        @Override public void run()
        {
            int local_value = MY_INT;
            while (MY_INT < 5) {
                LOGGER.log(Level.INFO,
                        "Incrementing MY_INT to {0}",
                        local_value + 1);
                MY_INT = local_value++;
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ChangeListener change1 = new ChangeListener();
        ChangeMaker change2 = new ChangeMaker();
        change1.start();
        change2.start();
        // change1.join();
      //  change2.join();
        System.out.println(LOGGER.getName());
    }
}

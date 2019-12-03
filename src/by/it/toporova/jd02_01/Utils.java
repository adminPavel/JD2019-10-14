package by.it.toporova.jd02_01;

import java.util.Random;

class Utils {

    static int random(){
        return randInt(0, 2);
    }

    static int randInt(int min, int max) {
        if (max < min) {
            int swap = min;
            min = max;
            max = swap;
        }

        Random rand = new Random();

        return rand.nextInt((max - min) + 1) + min;
    }

    static void sleep(int timeout){
        try {
            Thread.sleep(timeout/Dispatcher.kSpeed);
        } catch (InterruptedException e) {
            System.out.println("Unexpected interupt");
        }
    }

}

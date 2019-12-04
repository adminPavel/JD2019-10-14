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

    static String getRandomGoods() {
        int goodNumber = randInt(1, Goods.priceList.size());
        switch (goodNumber){
            case 1: return "хлеб";
            case 2: return "молоко";
            case 3: return "кефир";
            case 4: return "колбаса";
            case 5: return "сыр";
            case 6: return "мандарины";
            case 7: return "чай";
            case 8: return "батон";
            case 9: return "огурцы";
            case 10: return "пельмени";
            case 11: return "яйца";
            default: return null;
        }
    }

}

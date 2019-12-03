package by.it.kazak.jd02_01;

import java.util.HashMap;

class Counter {

    static int countBuyer = 0;
    static int kSpeed = 10000;
    final static int finishTime = 60;
    private static HashMap<String, Double> products = new HashMap<String, Double>() {
        {
            put("potato", 2.0);
            put("milk", 4.1);
            put("bread", 1.5);
            put("eggs", 3.2);
            put("bubble gum", 1.2);
            put("rice", 1.7);
            put("peanuts", 4.3);
            put("water", 0.5);
        }
    };

    static HashMap<String, Double> getGoods() {
        return products;
    }

}

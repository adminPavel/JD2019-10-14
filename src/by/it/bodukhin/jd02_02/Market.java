package by.it.bodukhin.jd02_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Market {
    public static Map<String, Double> goods = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        List<Buyer> buyerList = new ArrayList<>();


        goods.put("milk", 1.0);
        goods.put("bread", 1.25);
        goods.put("sprite", 1.5);
        goods.put("beer", 2.0);

        System.out.println("Market opened");
        new Dispatcher().start();
        while (Dispatcher.countBuyer < Dispatcher.PLAN) {
            int currentCount = Helper.random(2);
            while (Dispatcher.countBuyer < 2) {
                for (int j = 0; j <= currentCount; j++) {
                    Buyer buyer = new Buyer(++Dispatcher.countBuyer);
                    buyerList.add(buyer);
                    buyer.start();

                    if (Dispatcher.countBuyer == Dispatcher.PLAN) {
                        break;
                    }
                }
            }
            Helper.sleep(1000);

        }
        for (Buyer buyer : buyerList) {
            buyer.join();
        }
        System.out.println("Market closed");
    }
}


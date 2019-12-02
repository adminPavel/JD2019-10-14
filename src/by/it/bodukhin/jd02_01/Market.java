package by.it.bodukhin.jd02_01;

import java.util.ArrayList;
import java.util.List;

public class Market {
    public static void main(String[] args) throws InterruptedException {
        List<Buyer> buyerList = new ArrayList<>();
        System.out.println("Market opened");
        for (int i = 0; i < 120; i++) {
            int currentCount = Helper.random(2);
            for (int j = 0; j <= currentCount; j++) {
                Buyer buyer = new Buyer(++Dispatcher.countBuyer);
                buyerList.add(buyer);
                buyer.start();
            }
        }
        for(Buyer buyer : buyerList){
            buyer.join();
        }

        System.out.println("Market closed");

    }
}

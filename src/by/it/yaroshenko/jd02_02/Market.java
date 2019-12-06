package by.it.yaroshenko.jd02_02;

import java.util.ArrayList;

public class Market {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Market opened");
        ArrayList<Buyer> buyerList = new ArrayList<>();
        int numberBuyer = 0;
        while (Dispatcher.marketIsOpened()) {


            int currentCount = Helper.random(2);
            for (int i = 0; i < currentCount; i++) {
                if (Dispatcher.marketIsOpened()) {
                    Dispatcher.marketIsOpened();
                    Buyer buyer = new Buyer(++numberBuyer);
                    buyerList.add(buyer);
                    buyer.start();
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

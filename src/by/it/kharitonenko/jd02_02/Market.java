package by.it.kharitonenko.jd02_02;

import by.it.kharitonenko.jd02_02.Utils.BuyerQueue;
import by.it.kharitonenko.jd02_02.Utils.CashierObserver;
import by.it.kharitonenko.jd02_02.Utils.Observer;
import by.it.kharitonenko.jd02_02.Utils.Utils;

import java.util.ArrayList;
import java.util.List;

/*
Change SPEED value in Utils class to control speed (higher value == faster)
 */
public class Market {
    public static List<Buyer> buyerList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.print("'+' symbol marks pensioner\n");
        Utils.sleep(2_000);
        System.out.println("MARKET IS OPEN");
        CashierObserver.buyerQueueCheck();
        CashierObserver.createCashiers();

        int buyerNumber = 0;
        while (Observer.marketOpened()) {
            int entranceCustomer = Utils.intRandom(Observer.getBirthControlA());
//            int entranceCustomer = Utils.intRandom(Observer.getBirthControl(t));
            for (int i = 0; i < entranceCustomer; i++) {
                Buyer buyer = new Buyer(++buyerNumber);
                buyerList.add(buyer);
                buyer.start();
            }
            Utils.sleep(1_000);
            System.out.println("===========================");
            System.out.println("CURRENT NUMBER OF CUSTOMERS: " + Observer.countCurrentBuyers());
            System.out.println("CURRENT QUEUE SIZE: " + BuyerQueue.getQueueSize());
            System.out.println("===========================");
        }

        for (Buyer buyer : buyerList) {
            buyer.join();
        }

//        for (Thread thread : threads) {
//            thread.notifyAll();
//            thread.join();
//        }

        System.out.println("Market is closed!");
        System.out.println("Total number of customers: " + Observer.getAllBuyers());
    }
}

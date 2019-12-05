package by.it.kharitonenko.jd02_02;

import by.it.kharitonenko.jd02_02.Utils.BuyerQueue;
import by.it.kharitonenko.jd02_02.Utils.Utils;

public class Cashier extends Thread {
    private String cashierName;

    Cashier(int number) {
        cashierName = "Cashier# " + number;
        System.out.println(cashierName + " started working.");
        this.start();
    }

    @Override
    public void run() {
        while (Utils.checkWork()) {
            Buyer currentBuyer = BuyerQueue.extract();
            if (currentBuyer != null) {
                System.out.println(cashierName + " <------> " + currentBuyer);
                Utils.sleep(Utils.intRandom(2000, 5000));
                System.out.println(currentBuyer + " bought " + currentBuyer.getBasket().checkBasket());
                System.out.println(currentBuyer + " spent $" + currentBuyer.getCheque());
                synchronized (currentBuyer) {
                    currentBuyer.notify();
                }
            }
        }
        System.out.println(cashierName + " finished his work.");
    }
}

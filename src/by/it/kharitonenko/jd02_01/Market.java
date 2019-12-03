package by.it.kharitonenko.jd02_01;

import by.it.kharitonenko.jd02_01.Utils.Observer;
import by.it.kharitonenko.jd02_01.Utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Market {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MARKET IS OPEN");
        List<Buyer> customers = new ArrayList<>();
        for (int t = 0; t < 120; t++) {
            int entranceCustomer = Utils.intRandom(Observer.getBirthControl(t));
            for (int i = 0; i < entranceCustomer; i++) {
                Observer.addBuyer();
                Buyer buyer = new Buyer(Observer.getAllBuyers());
                customers.add(buyer);
                buyer.start();
            }
            Utils.sleep(1_000);
            //update data every 5 seconds
            if (t % 5 == 0) {
                System.out.println("===========================");
                System.out.println("TIME PASSED: " + t);
                System.out.println("CURRENT NUMBER OF CUSTOMERS: " + Observer.countCurrentBuyers());
                System.out.println("===========================");
            }
        }
        for (Buyer buyer : customers) {
            buyer.join();
        }
    }
}

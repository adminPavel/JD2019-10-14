package by.it.kharitonenko.jd02_02;

import by.it.kharitonenko.jd02_02.Utils.Observer;
import by.it.kharitonenko.jd02_02.Utils.Utils;

import java.util.ArrayList;
import java.util.List;

/*
Change SPEED in Utils class to control speed (higher value == faster)
 */
public class Market {
    static final Integer monitor = 0;
    public static void main(String[] args) throws InterruptedException {
        System.out.print("'+' symbol marks pensioner\n" +
                "Market gives updates every 10 seconds\n" +
                "You can see how much money customer has when he enters and when he leaves\n\n");
        Utils.sleep(5_000);
        System.out.println("MARKET IS OPEN");

        List<Cashier> cashiers = new ArrayList<>();
        List<Buyer> customers = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            cashiers.add(new Cashier(i));
        }

        for (int t = 0; t < 120/Utils.getGlobalSpeed(); t++) {
            int entranceCustomer = Utils.intRandom(Observer.getBirthControlA() );
//            int entranceCustomer = Utils.intRandom(Observer.getBirthControl(t));
            for (int i = 0; i < entranceCustomer; i++) {
                Observer.addBuyer();
                Buyer buyer = new Buyer(Observer.getAllBuyers());
                customers.add(buyer);
                buyer.start();
            }
            Utils.sleep(1_000);
            //update data every 5 seconds
            if (t % 10 == 0) {
                System.out.println("===========================");
                System.out.println("TIME PASSED: " + t);
                System.out.println("CURRENT NUMBER OF CUSTOMERS: " + Observer.countCurrentBuyers());
                System.out.println("===========================");
            }
        }
        for (Buyer buyer : customers) {
            buyer.join();
        }
        System.out.println("Market is closed!");
        System.out.println("Total number of customers: " + Observer.getAllBuyers());
    }
}

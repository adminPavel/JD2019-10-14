package by.it.yaroshenko.jd02_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Market {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Market opened");
        ArrayList<Buyer> buyerList = new ArrayList<>();

        for (int time = 0; time < 20; time++) {
            int currentCount = Helper.random(2); //случайным образом создает количество байеров (от 0 до 2) перед тем как заснуть на 1 сек
            for (int i = 0; i < currentCount; i++) {
                Buyer buyer = new Buyer(++Dispatcher.buyerCount);
                buyerList.add(buyer);
                buyer.start();
            }
            Helper.sleep(1000);
        }
        for (Buyer buyer : buyerList) {
            buyer.join();
        }
        System.out.println("Market closed");
    }
}

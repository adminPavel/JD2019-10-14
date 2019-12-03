package by.it.sermyazhko.jd02_01;

import java.util.*;

public class Market {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Market opened");
        List<Buyer> buyerList = new ArrayList<>();
        for (int t = 0; t < 120; t++) {
            int currentCount = Helper.random(2);
            for (int i = 0; i <= currentCount; i++) {
                Buyer buyer = new Buyer(++Dispatcher.countBuyer);
                buyerList.add(buyer);
                buyer.start();
            }
            Helper.sleep(1000);
        }

        for (Buyer buyer : buyerList) {
            buyer.join();
        }
        System.out.println("Market closed");


        Map<String,Integer> goods = new HashMap<>(100);
        for (int i = 0; i < goods.size(); i++) {
            goods.put(String.format("goods_%d",i),i);
        }
        Set<Map.Entry<String, Integer>> entries = goods.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + next.getValue());


        }

    }

}

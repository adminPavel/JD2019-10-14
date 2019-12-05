package by.it.kharitonenko.jd02_02.Utils;

import by.it.kharitonenko.jd02_02.Buyer;

import java.util.ArrayDeque;
import java.util.Deque;

public class BuyerQueue {
    private final static Deque<Buyer> buyerQueue = new ArrayDeque<>();

    public static void add(Buyer buyer) {
        synchronized (buyerQueue) {
            buyerQueue.add(buyer);
        }
    }

    public static Buyer extract() {
        synchronized (buyerQueue) {
            return buyerQueue.poll();
        }
    }

    public static int getQueueSize() {
        synchronized (buyerQueue) {
            return buyerQueue.size();
        }
    }
}

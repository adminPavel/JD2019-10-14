package by.it.toporova.jd02_02;


class Dispatcher {
    static final int k_speed = 100;
    static int buyersCount;
    static int totalBuyersCount;
    static int totalRetiredCount;
    private static final Object LOCK_BUYERS = new Object();    //монитор для инкремента и декремента количества покупателей


    //метод "покупатель вошёл в магазин"
    static void newBuyer() {
        synchronized (LOCK_BUYERS) {
            buyersCount++;
        }
    }
}

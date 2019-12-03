package by.it.kharitonenko.jd02_01.Utils;

public class Observer {
    //this variable counts ALL buyers
    static int allBuyers = 0;
    //this one counts only CURRENT buyers
    static int numberOfBuyers = 0;
    //allowed customers count
    static int birthControl = 1;
    //money spent by all customers
    static int marketMoney = 0;

    /**
     * This method controls current number of customers in the market.
     *
     * @param entered true if customer entered the market; false if he left it
     */
    public static void entranceAction(boolean entered) {
        if (entered) numberOfBuyers++;
        else numberOfBuyers--;
    }

    public static int countCurrentBuyers() {
        return numberOfBuyers;
    }

    public static int getBirthControl(int time) {
        if (time / 60 > 0) {
            time -= 60;
        }
        int allowedNumber = birthControl;
        if (time < 30) {
            if (numberOfBuyers < time+10 || allowedNumber<20) allowedNumber += Utils.intRandom(1);
        } else {
            if (numberOfBuyers > 40 + (30 - time)) {
                --allowedNumber;
                return 0;
            }
        }
        birthControl = allowedNumber;
        return birthControl;
    }

    public static int getAllBuyers() {
        return allBuyers;
    }

    public static void addBuyer() {
        allBuyers++;
    }

    public static int getMarketMoney() {
        return marketMoney;
    }

    public static void addMarketMoney(int cashToAdd) {
        marketMoney =+ cashToAdd;
    }
}

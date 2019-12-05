package by.it.kharitonenko.jd02_02.Utils;

public class Observer {
    //this variable counts ALL buyers
    static int allBuyers = 0;
    //this one counts only CURRENT buyers
    static int numberOfBuyers = 0;
    //allowed customers count
    static int birthControl = 1;
    //all money market earned
    static int marketMoney = 0;

    /**
     * This method controls current number of customers in the market.
     *
     * @param entered true if customer entered the market; false if he left it
     */
    public static void entranceAction(boolean entered) {
        synchronized (Utils.MONITOR_OBSERVER) {
            if (entered) {
                numberOfBuyers++;
            } else numberOfBuyers--;
        }
    }

    public static int countCurrentBuyers() {
        return numberOfBuyers;
    }

    public static int getBirthControlA() {
        if (Utils.MAX_ALLOWED - allBuyers <= 5) {
            return Utils.MAX_ALLOWED - allBuyers;
        }
        if (allBuyers > Utils.MAX_ALLOWED) {
            return 0;
        }
        return Utils.intRandom(5);
    }

    public static int getBirthControl(int time) {
        if (time / 60 > 0) {
            time -= 60;
        }
        if (getAllBuyers() > Utils.MAX_ALLOWED) {
            return 0;
        }
        int allowedNumber = birthControl;
        if (numberOfBuyers > 30) {
            birthControl = allowedNumber - Utils.intRandom(4);
        }
        if (time < 30) {
            if (numberOfBuyers < time + 10 || allowedNumber < 20) allowedNumber += Utils.intRandom(2);
        } else {
            if (numberOfBuyers > 40 + (30 - time)) {
                birthControl--;
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
        synchronized (Utils.MONITOR_OBSERVER) {
            allBuyers++;
        }
    }
}

package by.it.kharitonenko.jd02_01;

import by.it.kharitonenko.jd02_01.Interfaces.IBuyer;
import by.it.kharitonenko.jd02_01.Interfaces.IUseBasket;
import by.it.kharitonenko.jd02_01.Utils.Utils;

import java.util.Random;

public class Buyer extends Thread implements IBuyer, IUseBasket {
    private final boolean PENSIONER;

    private Basket basket;
    private int currentMoney;

    Buyer(int number) {
        super("Buyer number: " + number);
        int age = new Random().nextInt(4) + 1;
        basket = new Basket();
        currentMoney = Utils.intRandom(4, 16);
        //TODO examine simplified IF statement suggested by IDEA
        if (age == 4) {
            this.PENSIONER = true;
        } else {
            this.PENSIONER = false;
        }
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public void enterToMarket() {
        //TODO
    }

    @Override
    public void chooseGoods() {
        //TODO
    }

    @Override
    public void goOut() {
        //TODO
    }

    @Override
    public void takeBasket() {
        //TODO
    }

    /**
     * Puts product into the basket.
     * Value <b>result</b> is amount of money customer will spend on chosen product.
     * It equals to -1 if customer can't decide (for example, if there is no money).
     * There is also <b>tries</b> value, it shows how many times customer will try
     * to pick something before leaving the marketplace. Since the most expensive item is $4
     * and the minimum amount of money customer gets is also $4, there will always be at least
     * one item in the basket.
     * <b>Tries</b> value can be changed in <b>Utils</b> class.
     */
    @Override
    public void putGoodsToBasket() {
        int tries = Utils.getTRIES();
        do {
            int result = basket.buySomething(Utils.pickRandomProduct(), currentMoney);
            tries--;
            if (result > 0) {
                currentMoney -= result;
            }
            //TODO WAIT HERE
        } while (basket.getCapacity() > 0);
    }
}

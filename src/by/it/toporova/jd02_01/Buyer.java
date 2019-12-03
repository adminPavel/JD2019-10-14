package by.it.toporova.jd02_01;

import java.util.HashMap;

public class Buyer extends Thread implements IBuyer, IUseBasket {
    private boolean pensioner = false; //каждый четвертый - пенсионер, скорость пенсиорена в 1.5 раз меньше
    private HashMap<Object, Object> basket;


    public Buyer(int num) {

        super("Buyer №" + num);
        this.pensioner = pensioner;

    }

    @Override
    public void run() {
        enterToMarket();
        takeBasket();
        chooseGoods();
        goOut();

    }

    @Override
    public String toString() {
        if (this.pensioner) {
            return this.getName() + " (pensioner): ";
        } else {
            return this.getName();
        }
    }

    @Override
    public void enterToMarket() {
        System.out.println(this + " entered the market");
    }

    @Override
    public void chooseGoods() {
        int pause = Utils.randInt(500, 2000);
        if (this.pensioner) {
            pause = (int) (1.5 * pause);
        }
        Utils.sleep(1000);
        System.out.println(this + " chose goods");
        putGoodsToBasket(new Goods("Item", 2.1), Utils.randInt(1, 4));
    }

    @Override
    public void goOut() {
        System.out.println(this + " left the market");
        this.interrupt();

    }

    @Override
    public void takeBasket() {
        int pause = Utils.randInt(100, 200);
        if (this.pensioner) {
            pause = (int) (1.5 * pause);
        }
        Utils.sleep(1000);
        this.basket = new HashMap<>();
        System.out.println("------" + this + " took a basket" + "------");

    }

    @Override
    public void putGoodsToBasket(Goods goods, int count) {
        int pause = Utils.randInt(100, 200);
        if (this.pensioner) {
            pause = (int) (1.5 * pause);
        }
        if (this.basket != null) {
            this.basket.put(goods, count);
            System.out.println("+----" + this + " took goods" + goods + count + "------+");
        } else {
            System.out.println(this + " left a basket");
        }
    }
}

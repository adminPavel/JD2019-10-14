package by.it.kharitonenko.jd02_01.Utils;

/**
 * List of all goods with their prices. Both prices and goods can be edited here.
 */
public enum Goods {
    APPLES(1),
    MILK(1),
    EGGS(1),
    MEAT(3),
    COFFEE(4),
    CIGARETTES(2),
    VEGETABLES(1);

    private final int PRICE;

    Goods(int price) {
        PRICE = price;
    }

    public int getPRICE() {
        return PRICE;
    }
}

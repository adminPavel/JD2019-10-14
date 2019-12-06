package by.it.yaroshenko.jd02_02;

public class Chier implements Runnable {
    private String name;

    public Chier(int number) {
        this.name = "Cashier № "+number;
    }

    @Override
    public void run() {
        System.out.println(this+ " opened");

        System.out.println(this+ " closed");
    }

    @Override
    public String toString() {
        return name;
    }
}

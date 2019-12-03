package by.it.toporova.jd02_01;

 class Goods {
    private String name;
    private Double price;

    Goods(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    Double getPrice() {
        return price;
    }
}

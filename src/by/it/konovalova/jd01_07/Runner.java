package by.it.konovalova.jd01_07;

public class Runner {

    public static void main(String[] args) {

        Scalar v1 = new Scalar(3.1415);
        Var v2 = new Scalar ((Scalar) v1);
        Var v3 = new Scalar("3.1415");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
package by.it.konovalova.jd01_07;

import java.util.Arrays;

public class RunnerB {

    public static void main(String[] args) {

        Vector v1 = new Vector(new double[]{1.0, 2.0, 4.0});
        Var v2 = new Vector((Vector) v1);
        Var v3 = new Vector("{1.0,2.0,4.0}");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}

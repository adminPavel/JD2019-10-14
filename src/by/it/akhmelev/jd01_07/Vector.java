package by.it.akhmelev.jd01_07;

import java.util.Arrays;

public class Vector extends Var{

    private double[] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value,value.length);
    }


}

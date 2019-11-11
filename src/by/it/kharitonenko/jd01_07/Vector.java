package by.it.kharitonenko.jd01_07;

import java.util.Arrays;

public class Vector {
    private double[] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value, value.length);
    }
}

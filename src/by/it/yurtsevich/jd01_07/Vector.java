package by.it.yurtsevich.jd01_07;

import java.util.Arrays;

public class Vector {

    private double[] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value, value.length);


    }

    public Vector(Vector vector) {
        this.value = Arrays.copyOf(value, value.length);
    }

    public Vector(double v) {
        this.value = value;

    }

    public String toString() {
        return Double.toString(value.length);
    }
}
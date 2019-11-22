package by.it.zimina.jd01_09;

import java.util.Arrays;

class Vector extends Var {

    private double[] value;

    Vector(double[] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("{");
        String delimiter="";
        for (double element: value) {
            sb.append(delimiter).append(element);
            delimiter=", ";
        }
        sb.append("}");
        return  sb.toString();
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double[] sum = Arrays.copyOf(value,value.length);
            for (int i = 0; i < sum.length; i++) {
                sum[i]= sum[i]+((Scalar)other).getValue();
            }
            return new Vector(sum);
        }
        else if (other instanceof Vector) {
            double[] sum = Arrays.copyOf(value,value.length);
            for (int i = 0; i < sum.length; i++) {
                sum[i]= sum[i]+((Vector)other).value[i];
            }
            return new Vector(sum);
        }
        return super.add(other);
    }
}

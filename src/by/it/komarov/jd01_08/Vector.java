package by.it.komarov.jd01_08;

import java.util.Arrays;

class Vector extends Var {
    private double[] value;

    public double[] getValue() {
        return value;
    }

    Vector(double[] value) { this.value = value; }

    Vector(Vector vector)  { this.value = vector.value; }

    Vector(String strValue){
        String[] str = strValue.replace('{', ' ').replace('}', ' ').trim().split(",\\s*");
        value = new double[str.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble(str[i]);
        }
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double[] sum = Arrays.copyOf(value, value.length);
            for (int i = 0; i < sum.length; i++) {
                sum[i] = sum[i] + ((Scalar) other).getValue();
            }
            return new Vector(sum);
        } else {
            if (other instanceof Vector) {
                double[] sum = Arrays.copyOf(value, value.length);
                for (int i = 0; i < sum.length; i++) {
                    sum[i] = sum[i] + ((Vector) other).value[i];
                }
                return new Vector(sum);
            } else
                return super.add(other);
        }
    }

    @Override
    public Var sub(Var other) {
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        return super.mul(other);
    }

    @Override
    public Var div(Var other) {
        return super.div(other);
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";

        for (double element : value) {
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}

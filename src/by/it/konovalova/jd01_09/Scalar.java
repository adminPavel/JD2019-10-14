package by.it.konovalova.jd01_09;


class Scalar extends Var {

    private double value;

    public double getValue() {
        return value;
    }

    Scalar(double value) {
        this.value = value;
    }

    Scalar(Scalar otherScalar) {
        this.value = otherScalar.value;
    }

    public Scalar(String strScalar) {
        this.value = Double.parseDouble(strScalar);
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double sum = this.value + ((Scalar) other).value;
            return new Scalar(sum);
        } else
            return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            double dif = this.value - ((Scalar) other).value;
            return new Scalar(dif);
        } else
            return new Scalar(-1).mul(other).add(this);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar) {
            double prod = this.value * ((Scalar) other).value;
            return new Scalar(prod);
        } else
            return other.mul(this);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar && ((Scalar) other).value!=0) {
            double quot = this.value / ((Scalar) other).value;
            return new Scalar(quot);
        } else
            return other.div(other);
    }


    @Override
    public String toString() {
        return Double.toString(value);
    }
}


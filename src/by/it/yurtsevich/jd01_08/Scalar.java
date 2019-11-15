package by.it.yurtsevich.jd01_08;


class Scalar extends Var {

    private double value;

    Scalar(double value) {
        this.value = value;
    }

    Scalar(Scalar otherSkalar) { this.value = otherSkalar.value; }

    public Scalar(String strScalar) {
        this.value = Double.parseDouble(strScalar);
    }

    public String toString() {
        return Double.toString(value);
    }
}
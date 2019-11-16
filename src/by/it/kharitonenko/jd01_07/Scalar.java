package by.it.kharitonenko.jd01_07;

class Scalar extends Var {
    private double value;

    Scalar(double value) {
        this.value = value;
    }
    Scalar(Scalar otherScalar) {
        this.value = otherScalar.value;
    }
    Scalar(String strScalar) {
        this.value = Double.parseDouble(strScalar);
    }

    @Override
    public String toString() {
        return Double.toString(this.value);
    }
}

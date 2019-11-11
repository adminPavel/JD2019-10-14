package by.it.kharitonenko.jd01_07;

class Scalar extends Var {
    private double value;

    Scalar(double value) {
        this.value = value;
    }

    Scalar(Scalar valueScalar) {
        this.value = valueScalar.value;
    }

    Scalar(String valueString) {
        this.value = Double.parseDouble(valueString);
    }

    @Override
    public String toString() {
        return Double.toString(this.value);
    }
}

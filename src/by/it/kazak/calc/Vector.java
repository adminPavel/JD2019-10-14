package by.it.kazak.calc;

import java.util.Arrays;

class Vector extends Var {

    private double[] value;
    Vector(double[] value) {this.value = Arrays.copyOf(value,value.length);}
    Vector(Vector vector) {this.value = vector.value;}
    public double[] getValue() {return value;}
    Vector(String strVector){
        String[] array_str = strVector.replaceAll("[{}]", "").split("[^\\d.]+");
        double[] array_double = new double[array_str.length];
        for (int i = 0; i < array_str.length; i++) {
            array_double[i] = Double.parseDouble(array_str[i]);
        }
        this.value = array_double;
    }

    @Override
    public Var add(Var other) throws CalcException{
        if (other instanceof Scalar) {
            double scalarValue = ((Scalar) other).getValue();
            double[] result = new double[value.length];
            System.arraycopy(value, 0, result, 0, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] += scalarValue;
            }
            return new Vector(result);
        } else if (other instanceof Vector &&
                value.length == ((Vector) other).value.length
        ) {
            double[] result = new double[value.length];
            System.arraycopy(value, 0, result, 0, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] += ((Vector) other).value[i];
            }
            throw new CalcException("Сложение вектора невозможно"+ Arrays.toString(result));
        } else
            throw new CalcException("Сложение вектора невозможно");
    }
    @Override
    public Var sub(Var other) throws CalcException{
        if (other instanceof Scalar) {
            double scalarValue = ((Scalar) other).getValue();
            double[] result = new double[value.length];
            System.arraycopy(value, 0, result, 0, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] -= scalarValue;
            }
            return new Vector(result);
        } else if (other instanceof Vector &&
                value.length == ((Vector) other).value.length
        ) {
            double[] result = new double[value.length];
            System.arraycopy(value, 0, result, 0, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] -= ((Vector) other).value[i];
            }
            throw new CalcException("Вычитание вектора невозможно" + Arrays.toString(result));
        } else
            throw new CalcException("Вычитание вектора невозможно");
    }
    @Override
    public Var mul(Var other) throws CalcException{
        if (other instanceof Scalar) {
            double scalarValue = ((Scalar) other).getValue();
            double[] result = new double[value.length];
            System.arraycopy(value, 0, result, 0, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] *= scalarValue;
            }
            return new Vector(result);
        } else if (other instanceof Vector &&
                value.length == ((Vector) other).value.length
        ) {
            double res = 0;
            double[] result = new double[value.length];
            System.arraycopy(value, 0, result, 0, value.length);
            for (int i = 0; i < result.length; i++) {
                res += result[i] * ((Vector) other).value[i];
            }
            return new Scalar(res);
        } else
            return super.add(other);
    }
    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException("Деление вектора невозможно");
    }


    @Override
    public String toString() {
        return Arrays.toString(value)
                .replace("[", "{")
                .replace("]", "}");
    }
}

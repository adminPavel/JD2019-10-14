package by.it.zabauniuk.jd01_09;

class Scalar extends Var{
    private double value;

    public double getValue() {
        return value;
    }

    Scalar(double value) {
        this.value = value;
    }

    @Override
    public Var add(Var other) {
        if(other.toString().matches(Patterns.SCALAR)){
            double sum = this.value + ((Scalar) other).value;
            return new Scalar(sum);
        }
        else
            return  other.add(this);

    }

    @Override
    public Var sub(Var other) {
        if(other.toString().matches(Patterns.SCALAR)){
            double sub = this.value - ((Scalar) other).value;
            return new Scalar(sub);
        }
        else
            return  new Scalar(-1).mul(other).add(this);

    }

    @Override
    public Var mul(Var other) {
        if(other.toString().matches(Patterns.SCALAR)){
            double mul = this.value*((Scalar) other).value;
            return new Scalar(mul);
        }
        else
            return  other.mul(this);

    }

    @Override
    public Var div(Var other) {
        if(other.toString().matches(Patterns.SCALAR)){
            double div = this.value/((Scalar) other).value;
            return new Scalar(div);
        }
        else
            return  other.div(this);

    }

    Scalar(String str){
        this.value=Double.parseDouble(str);
    }
    Scalar(Scalar scalar){
        this.value=scalar.value;
    }

    @Override
    public String toString() { //переопределение метода
        return Double.toString(value);
    }


}
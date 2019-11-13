package by.it.komarov.jd01_08;

class Vector extends Var {
    private double[] value;

    Vector(double[] value) { this.value = value; }

    Vector(Vector vector)  { this.value = vector.value; }


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

    @Override
    public Var add(Var other) {
        return null;
    }

    @Override
    public Var sub(Var other) {
        return null;
    }

    @Override
    public Var mul(Var other) {
        return null;
    }

    @Override
    public Var div(Var other) {
        return null;
    }
}

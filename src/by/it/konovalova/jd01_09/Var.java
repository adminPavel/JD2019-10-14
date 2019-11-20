package by.it.konovalova.jd01_09;

abstract class Var implements Operation {

    public static Var createVar(String operand){

        if(operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        else if(operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        else if(operand.matches(Patterns.MATRIX))
            return new Matrix(operand);
        else
            return null;


    }

    @Override
    public Var add(Var other) {
        System.out.println("Операция сложения "+this+"+"+other+" невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция вычитания "+this+"-"+other+" невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция умножения "+this+"*"+other+" невозможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Операция деления "+this+"/"+other+" невозможна");
        return null;
    }
}

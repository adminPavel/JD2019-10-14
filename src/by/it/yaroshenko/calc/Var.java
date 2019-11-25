package by.it.yaroshenko.calc;

import java.util.HashMap;
import java.util.Map;

abstract class Var implements Operation {

    private static Map<String, Var> vars= new HashMap<>();

    static Var saveVar (String name, Var var) {
        vars.put(name,var);
        return var;
    }

    static Var createVar(String operand) {
        operand=operand.replaceAll("\\s+","");
        if (operand.matches(Patterns.SCALAR)) {
            return new Scalar(operand);
        } else
        if (operand.matches((Patterns.VECTOR))) {
            return new Vector(operand);
        }else
        if (operand.matches(Patterns.MATRIX)) {
            return new Matrix(operand);
        } else
            if(vars.containsKey(operand)) {
                return vars.get(operand);
            }
        return null; //TODO generate TRY/CATCH
    }


    @Override
    public String toString() {
        return "This is Var class";
    }

    @Override
    public Var add(Var other) {
        System.out.printf("Сложение %s + %s невозможно\n", other, this);
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Вычитание %s - %s невозможно\n", other, this);
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Умножение %s * %s невозможно\n", other, this);
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Деление %s / %s невозможно\n", other, this);
        return null;
    }

}

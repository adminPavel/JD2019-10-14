package by.it.kazak.calc;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

abstract class Var implements Operation {


    private static Map<String,Var> vars=new HashMap<>();
    static void set(String name, Var var){
        vars.put(name,var);
    }
    static Var get(String name){
        return vars.get(name);
    }


    @Override
    public Var add(Var other) throws CalcException{
        throw new CalcException(String.format("Сложение %s + %s невозможно\n",this,other));
    }

    @Override
    public Var sub(Var other) throws CalcException{
        throw new CalcException(String.format("Вычитание %s - %s невозможно\n",this,other));
    }

    @Override
    public Var mul(Var other) throws CalcException{
        throw new CalcException(String.format("Умножение %s * %s невозможно\n",this,other));
    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException(String.format("Деление %s / %s невозможно\n",this,other));
    }
    @Override
    public String toString() {
        return "abstract Var";
    }


    public static Var createVar(String strVar) throws CalcException{
        if (strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar);
        else if (strVar.matches(Patterns.VECTOR))
            return new Vector(strVar);
        else if (strVar.matches(Patterns.MATRIX))
            return new Matrix(strVar);
        else if (vars.containsKey(strVar))
            return vars.get(strVar);
        else
            throw new CalcException("Не удалось создать переменную");
    }
}



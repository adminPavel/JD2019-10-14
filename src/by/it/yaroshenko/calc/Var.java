package by.it.yaroshenko.calc;

import java.util.*;

abstract class Var implements Operation {

    private static Map<String, Var> vars= new HashMap<>();

    static Var saveVar (String name, Var var) {
        vars.put(name,var);
        return var;
    }

    static Map getMap () {
          Map<String, Var> copy_vars = new HashMap<>();
          Set<Map.Entry<String, Var>> entries = vars.entrySet();
          for (Map.Entry<String, Var> entry : entries) {
          copy_vars.put(entry.getKey(),entry.getValue());
        }
        return vars;
    }
    static Map getSortMap () {
        Map<String, Var> copy_vars = new TreeMap<>();
        Set<Map.Entry<String, Var>> entries = vars.entrySet();
        for (Map.Entry<String, Var> entry : entries) {
            copy_vars.put(entry.getKey(),entry.getValue());
        }
        return vars;
    }

    static Var createVar(String operand) throws CalcException{
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
        throw  new CalcException("Невозможно создать "+operand);
    }

    @Override
    public String toString() {
        return "This is Var class";
    }

    @Override
    public Var add(Var other) throws CalcException{
       throw new CalcException("Сложение"+this+"+"+other+"невозможно\n");
    }

    @Override
    public Var sub (Var other) throws CalcException{
        throw new CalcException("Вычитание"+this+"-"+other+"невозможно\n");
    }

    @Override
    public Var mul (Var other) throws CalcException{
        throw new CalcException("Умножение"+this+"*"+other+"невозможно\n");
    }

    @Override
    public Var div (Var other) throws CalcException{
        throw new CalcException("Деление"+this+"/"+other+"невозможно\n");
    }
}

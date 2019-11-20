package by.it.sermyazhko.Calc;

import java.util.HashMap;

abstract class Var implements Operation {

    private static HashMap<String ,Var> vars = new HashMap<>();

    static void set(String name, Var var){
        vars.put(name, var);
    }

    static void get(String name, Var var){
       //return  vars.get(var.);
    }

    @Override
    public Var add(Var other) {
        System.out.printf("Сложение %s + %s невозможно\n",this,other);
        //TODO add exception
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Вычитание %s - %s невозможно\n",this,other);
        //TODO add exception
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Умножение %s * %s невозможно\n",this,other);
        //TODO add exception
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Деление %s / %s невозможно\n",this,other);
        //TODO add exception
        return null;
    }

    @Override
    public String toString() {
        return "abstract Var";
    }

    static Var createVar(String value){
       if(value.matches(PatternForExpression.SCALAR)){
           return new Scalar(value);
       }
       else if(value.matches(PatternForExpression.VECTOR)){
           return new Vector(value);
       }
       else if(value.matches(PatternForExpression.MATRIX)){
           return new Matrix(value);
       }
       else if (vars.containsKey(value))
          // return vars;
           return null;
       else
           return null;
    }

}

package by.it.sermyazhko.jd01_09;

import java.util.Scanner;

abstract class Var implements Operation {

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
       else
           return null;
    }

}

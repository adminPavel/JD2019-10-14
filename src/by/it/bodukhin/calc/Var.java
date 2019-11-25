package by.it.bodukhin.calc;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

abstract class Var implements Operation {

    private static Map<String, Var> vars = new HashMap<>();

    static Var saveVar (String name, Var var) {
        vars.put(name, var);
        return var;
    }

    static void printMap () {
        for (Map.Entry entry : vars.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    static void printSortedMap() {
        Map<String, Var> sortedMap = new TreeMap<>(String::compareToIgnoreCase);
        sortedMap.putAll(vars);
        for (Map.Entry entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    public static Var createVar(String strVar) {

        if (strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar);
        else if(strVar.matches(Patterns.VECTOR))
            return new Vector(strVar);
        else if(strVar.matches(Patterns.MATRIX))
            return new Matrix(strVar);
        else if(vars.containsKey(strVar)){
            return vars.get(strVar);
        }
        else
            return null;
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
}

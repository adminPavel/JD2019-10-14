package by.it.toporova.calc;


import java.util.HashMap;
import java.util.Map;

abstract class Var implements Operation { //все потомки var будут реализовывать интерфейс operation
    private static Map<String, Var> vars = new HashMap<>();

    static Var saveVar(String name, Var var) { //метод, который сохраняет переменные во внутреннюю карту vars
        vars.put(name, var);
        return var;
    }

//вход A=9 - в saveVar передастся ключ и значение
    static Var createVar(String operand) {
        operand = operand.trim().replace("\\s", "");
        if (operand.matches(Patterns.SCALAR)) {
            return new Scalar(operand);
        } else if (operand.matches(Patterns.VECTOR)) {
            return new Vector(operand);
        } else if (operand.matches(Patterns.MATRIX)) {
            return new Matrix(operand);
        }
        //если искомая строка находится в карте, то ее можно будет извлечь
        else if (vars.containsKey(operand)) {
            return vars.get(operand);
        }
        return null;

    }

    public static void printMap() {
        for (Map.Entry entry : vars.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    @Override
    public Var add(Var other) {
        System.out.println("Операция сложения " + this + "+" + other + "невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция вычитания " + this + "+" + other + "невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция умножения " + this + "+" + other + "невозможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Операция деления " + this + "+" + other + "невозможна");
        return null;
    }

    @Override
    public String toString() { //наследуется от object
        return "Это класс Var";
    }
}

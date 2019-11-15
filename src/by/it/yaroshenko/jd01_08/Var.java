package by.it.yaroshenko.jd01_08;

abstract class Var implements Operation{


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
        System.out.printf("Вычитание %s + %s невозможно\n", other, this);
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Умножение %s + %s невозможно\n", other, this);
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Деление %s + %s невозможно\n", other, this);
        return null;
    }

}

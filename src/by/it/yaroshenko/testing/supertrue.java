package by.it.yaroshenko.testing;
class ParentClass {
    public boolean isTue() {
        return true;
    }
}
class ChildClass extends ParentClass {

    public boolean isTue() {
        boolean result = super.isTue();
        return !result;
    }
}

public class supertrue {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        ParentClass parentClass = new ChildClass();
        ParentClass p = new ParentClass();
        System.out.println(p.isTue());
        System.out.println(parentClass.isTue());
        System.out.println(childClass.isTue());
    }
}

package by.it.yaroshenko.testing;

abstract class B {
    abstract class C {
        abstract void myAsstractMethod ();
    }
}
class D extends B {
    class E extends C {

        @Override
        void myAsstractMethod() {
            System.out.println("Inside abstract method implementation");
      }
    }
}
public class keyWordAbstract {
    public static void main(String[] args) {
        D outer = new D ();

        D.E inner = new D ().new E();
        inner.myAsstractMethod();
    }
}
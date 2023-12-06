package by.it.yaroshenko.testing;

public class Constructor1 {
    String name;
    Constructor1() {
        this("");

        System.out.println("No-argument constructor of" + " base class" + name + " 7");
    }
        Constructor1(String name) {
            this.name = name;
            System.out.println("Calling parameterized constructor" + " of base" + name + " 1");
        }
    }
class Derived1 extends Constructor1 {
    Derived1 () {
        System.out.println("No-argument constructor " +
                "of derived" + name + " 8");
    }
    Derived1 (String name) {
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived" + name + " 2");
    }

    public static void main(String[] args) {
        Derived1 dr = new Derived1("Test1");
        Derived1 dr1 = new Derived1();
    }
}


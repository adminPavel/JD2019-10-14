package by.it.yaroshenko.testing;
interface TestInterface {
    public void square (int a);

    default void show () {
        System.out.println("Default Method Executed");
    }
}
public class Inerf1 implements TestInterface{

    @Override
    public void square(int a) {
        System.out.println(a*a);
    }

    public static void main(String[] args) {
        Inerf1 i = new Inerf1();
        i.square(6);
        i.show();
    }
}

package by.it.yaroshenko.testing;

interface In1 {
    final int a = 10;
    static void display() {
        System.out.println("Hello");
    }
}
public class GFG3 implements In1{
    public static void main(String[] args) {
        GFG3 gfg = new GFG3();
        //gfg.display();
        In1.display();
    }
}

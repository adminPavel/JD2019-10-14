package by.it.yaroshenko.testing;

public class TestThis {
    int a, b;
    TestThis(){
        a= 10;
        b=20;
    }
    TestThis get(){
        return this;
    }
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args) {
        TestThis object = new TestThis();
        object.get().display();
    }
}

package by.it.yaroshenko.testing;

class Test {
    int a;
    int b;

    // Default constructor
    Test()
    {
        a = 10;
        b = 20;
    }

    // Method that receives 'this' keyword as parameter
    void display(Test obj)
    {
        System.out.println("a = " + obj.a
                + "  b = " + obj.b);
    }

    // Method that returns current class instance
    void get() { display(this); }

    // main function
    public static void main(String[] args)
    {
        Test object = new Test();
        object.get();
    }
}

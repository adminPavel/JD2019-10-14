package by.it.yaroshenko.testing;

class A2 {
    B4 obj;
    A2(B4 obj) {
        this.obj = obj;
        obj.display();
    }
}
class B4 {
    int x = 5;
    B4() {
        A2 obj = new A2(this);
    }

    void display() {
        System.out.println("Value of x in Class B : " + x);
    }
    public static void main(String[] args)
    {
       B4 obj = new B4();
       obj.display();
    }
}
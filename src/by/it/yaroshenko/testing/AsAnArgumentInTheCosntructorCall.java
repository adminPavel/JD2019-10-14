package by.it.yaroshenko.testing;

public class AsAnArgumentInTheCosntructorCall {
    B1 obj;

    AsAnArgumentInTheCosntructorCall(B1 obj) {
        this.obj = obj;
        obj.display();
    }

}
class B1 {
    int x = 5;
    B1() {
        AsAnArgumentInTheCosntructorCall obj= new AsAnArgumentInTheCosntructorCall(this);
    }
    void display () {
        System.out.println("Value of x in Class B : " + x);
    }
    public static void main(String[] args) {
        B1 obj = new B1();
       // obj.display();
    }
}

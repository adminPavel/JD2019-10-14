package by.it.yaroshenko.testing;

public class ThisAsMethodParameter {
    int a, b;
    ThisAsMethodParameter(){
        a = 10;
        b = 20;
    }
    void Display(ThisAsMethodParameter obj){
        System.out.println("a = " + obj.a + " b = " + b);
    }
    void get() {
        Display(this);
    }
    public static void main(String[] args) {
        ThisAsMethodParameter obj = new ThisAsMethodParameter();
        obj.get();
    }
}

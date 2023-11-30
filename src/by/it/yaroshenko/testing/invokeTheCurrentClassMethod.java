package by.it.yaroshenko.testing;

public class invokeTheCurrentClassMethod {
    void display() {
        this.show();
        System.out.println("Inside display function");
    }

    private void show() {
        System.out.println("Inside show function");
    }

    public static void main(String[] args) {
    invokeTheCurrentClassMethod inv = new invokeTheCurrentClassMethod();
    inv.display();
    }
}

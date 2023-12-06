package by.it.yaroshenko.testing;

public class thisKey {


    void display() {
        // calling function show()
        this.show();

        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show function");
    }

    public static void main(String args[]) {
        thisKey t1 = new thisKey();
        t1.show();
    }
}


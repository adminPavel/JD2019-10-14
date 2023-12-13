package by.it.yaroshenko.lesson.test;

public class NestedClass {
    static int outer_x = 10;
    int outer_y = 20;
    private static int outer_private = 30;
    static class StaticNestedClass {
        void display () {
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_private = " + outer_private);
            NestedClass nc = new NestedClass();
            System.out.println("outer_y = " + nc.outer_y);
        }
    }
    public static void main(String[] args) {
        NestedClass.StaticNestedClass ns = new NestedClass.StaticNestedClass();
        ns.display();
    }
}

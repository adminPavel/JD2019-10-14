package by.it.yaroshenko.testing;
public class ConstructorCopy1 {
    private double re, im;
    public ConstructorCopy1(double re, double im) {
        this.re = re;
        this.im = im;
    }
        ConstructorCopy1(ConstructorCopy1 copy1){
            System.out.println("Copy constructor called");
            this.re = copy1.re;
            this.im = copy1.im;
        }
        @Override
        public String toString() {
        return "(" + re + " + " + im + "i)";
        }
    public static void main(String[] args) {
        ConstructorCopy1 c1 = new ConstructorCopy1(10, 15);
        ConstructorCopy1 c2 = new ConstructorCopy1(c1);

        System.out.println(c2);
    }
}

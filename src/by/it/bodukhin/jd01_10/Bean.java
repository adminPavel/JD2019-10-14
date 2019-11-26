package by.it.bodukhin.jd01_10;

public class Bean {
    @Param(a=2,b=5)
    static double sum(int a, int b) {
        return a + b;
    }

    @Param(a=6, b=1)
    static double max(int a, int b) {
        if((double) a > b) {
            return a;
        } else return b;
    }

    double min(int a, int b) {
        if((double) a < b) {
            return a;
        } else return b;
    }

    @Param(a=5,b=2)
    double avg(int a, int b) {
        return (a+b)/2.0;
    }
}

package by.it.kharitonenko.jd01_10;

class Bean {

    @Param(a = 3, b = 5)
    static double sum(int a, int b) {
        return (double) a+b;
    }

    static double max(int a, int b) {
        return Math.max(a, b);
    }

    @Param(a = 5, b = 9)
    double min(int a, int b) {
        return Math.min(a, b);
    }

    @Param(a = 32, b = 21)
    double avg(int a, int b) {
        return (a+b)/2.0;
    }

}

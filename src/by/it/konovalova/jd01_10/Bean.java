package by.it.konovalova.jd01_10;


public class Bean {

    @Param(a = 10, b = 15)
    static double sum(int left, int right) {
        return left + right;
    }

    @Param(a = 10, b = 15)
    static double max(int left, int right) {
        if(left>right)
        return left;
        else return right;
    }

    @Param(a = 10, b = 15)
    double min(int left, int right) {
        if(left<right)
            return left;
        else return right;
    }

    double avg(int left, int right) {
        return (left + right)/2.0;
    }
}

package by.it.akhmelev.jd01_10;


public class Bean {

    @Param(a=10, b=15)
    double sum(int left, int right){
        return left+right;
    }

    @Param(a=10, b=15)
    static double max(int left, int right){
        return left<right?right:left;
    }

    @Param(a=10, b=15)
    static double min(int left, int right){
        return left>right?right:left;
    }

    double avg(int left, int right){
        return (left+right)/2.0;
    }



}

package by.it.komarov.jd01_10;

import by.it.komarov.Param;

public class TaskA {

    public static void main(String[] args) {

    }

    @Param(a = 3, b = 4)
    int test(int left, int right){
        return (left+right)/2;
    }
}

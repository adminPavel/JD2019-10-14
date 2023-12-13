package by.it.yaroshenko.lesson.test;

import java.math.BigInteger;
public class BigInteger1 {
   Integer slowA(Integer n) {
        if (n <= 1) {
            return n;
        } else {
            return slowA(n - 1) + slowA(n - 2);
        }
    }
    public static void main(String[] args) {
       // System.out.println();
        BigInteger1 bi = new BigInteger1();
        System.out.println(bi.slowA(555));

    }
}

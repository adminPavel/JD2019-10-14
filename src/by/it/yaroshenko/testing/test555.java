package by.it.yaroshenko.testing;

import java.util.Random;

public class test555 {
    private static Random generator = new Random(System.nanoTime());

    static int random(int max){
        return random(0,max);
    }
    static int random(int starts, int end){
        return starts+generator.nextInt(end-starts+1);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
        System.out.print(random(10)+" ");
        }
    }
}

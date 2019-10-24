package by.it.bodukhin.jd01_02;



import java.util.Scanner;


public class TaskC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int massum[][]=step1(n);
        System.out.println(step2(massum));
    }

     static int[][] step1(int n) {
        int mas[][] = new int[n][n];
        boolean min;
        boolean max;
        do {
            min = false;
            max = false;
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    int k = (int) Math.round((Math.random() * (2 * n) - n));
                    mas[i][j] = k;
                    if (k == -n) min = true;
                    if (k == n) max = true;
                }
            }
        } while (!min || !max);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        return mas;
    }

    static int step2(int[][] mas) {
        int result = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (count == 1 && mas[i][j] < 0 && mas[i].length - 1 > 0) {
                    sum = sum + mas[i][j];
                }
                if (mas[i][j] > 0) {
                    count++;
                }
            }
            result = result + sum;

            sum = 0;
            count = 0;;
        }
        return result;
    }
}



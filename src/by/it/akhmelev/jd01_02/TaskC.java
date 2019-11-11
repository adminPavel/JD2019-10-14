package by.it.akhmelev.jd01_02;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = step1(n);
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        int[][] res = step3(array);
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] step3(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        int rows = arr.length;
        int cols = arr[0].length;
        boolean[] delRow = new boolean[rows];
        boolean[] delCol = new boolean[cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == max) {
                    delRow[i] = true;
                    delCol[j] = true;
                }
            }
        }

        for (boolean e : delRow) if (e) rows--;
        for (boolean e : delCol) if (e) cols--;

        int[][] result=new int[rows][cols];
        int ir=0;
        for (int i = 0; i < arr.length; i++) {
            if (!delRow[i]){
                int jr=0;
                for (int j = 0; j < arr[i].length; j++) {
                    if (!delCol[j]){
                        result[ir][jr++]=arr[i][j];
                    }
                }
                ir++;
            }
        }


        return result;
    }

    static int[][] step1(int n) {
        int[][] array = new int[n][n];
        boolean maxOk;
        boolean minOk;
        do {
            maxOk = false;
            minOk = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = -n + (int) (Math.random() * (2 * n + 1));
                    if (array[i][j] == n) maxOk = true;
                    if (array[i][j] == -n) minOk = true;
                }

            }
        } while ((!maxOk) || (!minOk));
        return array;
    }

}

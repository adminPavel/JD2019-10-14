package by.it.bodukhin.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sn = new String[n];
        for (int i = 0; i < sn.length; i++) {
            sn[i] = sc.next();
        }

        int[][] salary = new int[n][4];
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Введите зарплату для " + sn[i]);
            for (int j = 0; j < 4; j++) {
                salary[i][j] = sc.nextInt();
            }
        }

        int[] yearsum = new int[n];
        int sumall = 0;
        for (int i = 0; i < yearsum.length; i++) {
            for (int j = 0; j < salary[0].length; j++) {
                yearsum[i] = yearsum[i] + salary[i][j];
                sumall = sumall + salary[i][j];

            }

        }
        double avg = (double) sumall/(n*4);

        System.out.println("-----------------------------------------------" +
                "------------");
        System.out.printf("%-10s%-11s%-11s%-11s%-11s%-10s","Фамилия","Квартал1",
                "Квартал2","Квартал3","Квартал4","Итого");
        System.out.println();
        System.out.println("-----------------------------------------------" +
                "------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s%-11d%-11d%-11d%-11d%-10d", sn[i],
                    salary[i][0], salary[i][1], salary[i][2],
                    salary[i][3], yearsum[i]);
            System.out.println();

        }
        System.out.println("-----------------------------------------------" +
                "------------");
        System.out.printf("%-10s%-11d","Итого",sumall);
        System.out.println();
        System.out.printf("%-10s%-11.4f","Средняя",avg);
        }
    }

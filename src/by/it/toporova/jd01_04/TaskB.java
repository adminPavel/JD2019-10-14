package by.it.toporova.jd01_04;


import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        //System.out.println("введите количество сотрудников");
        Scanner count = new Scanner(System.in);
        int n = count.nextInt();

        String[] namesArray = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println('\n');
            namesArray[i] = count.next();
        }
        //String[]namesArray = new String[n];


        //ввод зарплаты
        int[][] salary = new int[n][4];
        for (int i = 0; i < salary.length; i++) {
            //Scanner sl = new Scanner(System.in);
            System.out.println("Введите зарплату для " + namesArray[i]);
            for (int i1 = 0; i1 < 4; i1++) {
                salary[i][i1] = count.nextInt();
            }

        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------");

        //int x = 0;
        int[] sumOfRows = InOut.sumTableRows(salary);
        int allSums = 0;

        for (int y = 0; y < namesArray.length; y++) {
            System.out.printf("%-10s%-10d%-10d%-10d%-10d%-10d", namesArray[y], salary[y][0], salary[y][1], salary[y][2], salary[y][3], sumOfRows[y]);
            allSums = sumOfRows[y] + allSums;
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-10d", "Итого", allSums);
        System.out.println();
        double all = allSums;
        double avgSum = Math.round(all / (n*4) * 100000) / 100000.0d;
        System.out.printf("%-10s%-10.4f", "Средняя", avgSum);

    }
}







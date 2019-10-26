package by.it.yaroshenko.jd01_04;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
//Метод ввода числа фамилий, самих фамилий и запись их в массив String array
       int k = 4; //k количество столбцов
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
//Метод создает массив фамилий
        for (int i = 0; i < n; i++) {
          //  Scanner scanner = new Scanner(System.in);
            String people = sc.next();
            array[i] = people; //массив фамилий
        }
//Метод для ввода зарплаты
        int[][] array_salary = new int[n][k]; //двумерный итоговый массив зарплат
        int[] sum = new int[n]; //массив для суммы элементов
        int[] new_int_array = new int[n*k];////
        int[] array_sum = new int[array_salary.length];
        String[] new_array = new String[n]; //массив строк куда будем записывать зарплаты для работников
        int count=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите зарплату для " + array[i]);
            String salary = sc.nextLine();
            new_array[i] = salary;
            String[] arri = new_array[i].trim().split(" "); //создает массив стрингов

            for (int j = 0; j < arri.length; j++) {
               // String s = arri[j];
                int myInt =Integer.parseInt(arri[j]);
                new_int_array[count++] = myInt; //создает одномерный массив чисел int
             // InOut.getArrayInt(s);
            }
        }

//создаем двумерный массив, выводим сумму ЗП за год (n сумм)
        int count1=0;
        for (int i = 0; i < array_salary.length; i++) {  //строка row
            for (int j = 0; j < array_salary[i].length; j++) { //колонка column
                array_salary[i][j]=new_int_array[count1++];
                array_sum[i]+=array_salary[i][j]; //Годовая сумма каждого человека
            }
          }
//Вывод Фамилия + ЗП в одну строку
        System.out.println('\n'+"----------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            String s=new_array[i];
            System.out.printf("%-12s%-11s%15s%n", array[i] +":",  new_int_array[i], array_sum[i]);
       }
 //Метод выводит общую сумму всех выплат с массива int[] new_int_array
        int sum_total=0;
        for (int value : new_int_array) {
            sum_total = sum_total + value;
            //System.out.print(new_int_array[i]+" "); //Выводит одномерный массив интов на экран
        }
 //Выводит Итого и среднюю квартальную сумму
        System.out.println("----------------------------------------------------------");
        double average = (double)sum_total/(double)new_int_array.length;
        System.out.printf("%-12s%-11d%n", "Итого", sum_total);
        System.out.printf("%-12s%-11.5f%n", "Средняя", average);
    }
}









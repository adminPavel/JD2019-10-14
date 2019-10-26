package by.it.yaroshenko.jd01_05;
import static java.lang.Math.*;
public class TaskC {
        public static void main(String[] args) {
        double n_random = (Math.random() * 21 + 20);
       // System.out.println("Рандомное число от 20 до 40 = "+n_random);
        double x = (9.0-5.33)/n_random;
        int array_size = (int)ceil(n_random);
        double[] array = new double[array_size];
        int count=0;
        int count_new=0;
        for(double i = 5.33; i <= 9.0; i+=x) {
            array[count] = cbrt(i*i+4.5); //цикл заполняет массив значениями z
            if(array[count]>3.5) {
                count_new++;
            }
            count++;
        }
            //System.out.println("count_new="+count_new);
//цикл для нового массива, записали новый массив array_new, где z>3.5
           int index=0;
           double z;
            double[] array_new = new double[count_new];
            for(double i = 5.33; i <= 9.0; i+=x) {
                z= cbrt(i*i+4.5);
               if(z>3.5) {
                   array_new[index]=z;
                    index++;
                   }
                }
//
            printArray(array, "A", 5);
            System.out.println("\nМассив B[] из элементов массива A > 3.5\n");
            printArray(array_new, "B", 5);
    }

    /**
     *Данный метод осуществляет форматный вывод массива с заголовками и ндексами
     */
    private static void printArray(double[] array, String name, int column) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[ %d ] = %.5f",name, i, array[i]);
            if((i+1)%(column)==0 || i==array.length-1) {
                System.out.println();
            }
        }
    }
}





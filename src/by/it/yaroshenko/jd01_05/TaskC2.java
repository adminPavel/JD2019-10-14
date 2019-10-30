package by.it.yaroshenko.jd01_05;
public class TaskC2 {
    public static void main(String[] args) {
        String vertical_line="║ ";
        int n=31;//Расзмерность массива
        int count=0;
        int i_random_A;
        double i_random_B;

        int[] array_A = new int[n];
        for (int i = 0; i < n; i++) {
            i_random_A = 103 + (int) (Math.random() * ((450-103)+1));
            array_A[i] = i_random_A;
            i_random_B = (double)i_random_A*0.1;
            if(i_random_B>i) {
                count++;
            }
        }

        int[] array_B = new int[count];
        int index=0;
        System.out.println("count="+array_B.length);
        for (int i = 0; i < n; i++) {
            i_random_B = (double)array_A[i] *0.1;
            if (i_random_B>i) {
                array_B[index]=array_A[i];
                index++;
            }
        }
        System.out.println();
        printArray(array_A, "A", 5);
        System.out.println();
        printArrayB(array_B, "B",1, count);
    }
    /**
     *Данный метод осуществляет форматный вывод массива с заголовками и ндексами
     */
    private static void printArray(int[] array, String name, int column) {
        System.out.println("Massiv A <index to rows>");
        System.out.print("╔═══════════════╦═══════════════╦═══════════════╦═══════════════╦═══════════════╗\n");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("║ %s[ %d ] = %d\t",name, i, array[i]);

            if((i+1)%(column)==0 || i==array.length-1) {
                if (i!=array.length-1) {
                    System.out.println("║");
                } else {
                    System.out.print("║\t\t\t\t║\t\t\t\t║\t\t\t\t║\t\t\t\t║\t\t\t\t");
                    System.out.println();
                }
                if (i!=array.length-1) {
                    System.out.println("╠═══════════════╬═══════════════╬═══════════════╬═══════════════╬═══════════════╣");
                }
            }
        }
        //System.out.print("║\t\t\t\t║\t\t\t\t║\t\t\t\t║\t\t\t\t║\t\t\t\t");
        System.out.println("╚═══════════════╩═══════════════╩═══════════════╩═══════════════╩═══════════════╝");
    }

    private static void printArrayB(int[] array, String name, int column, int count) {
        int j;
        System.out.println("Massiv B <index to cols>");
        System.out.print("╔═══════════════╦═══════════════╗\n");
        for (int i = 0; i < array.length; i++) {

            j=i+(count+1)/2;
            int k=count/2;

            System.out.printf("║ %s[ %d ] = %d\t", name, i, array[i]);
            if (i==(k-1)&&(count)%2==0) {
                System.out.printf("║ %s[ %d ] = %d ║\t", name, j, array[j]);
            } else {
                System.out.printf("║ %s[ %d ] = %d ║\t\n%s", name, j, array[j], "╠═══════════════╬═══════════════╣");
            }
            if ((i + 1) % (column) == 0 || i == array.length - 1) {
                System.out.println();
            }
            if (i==(k-1)&&(count-1)%2==0) {
                System.out.printf("║ %s[ %d ] = %d ║\t\t\t\t║\n", name, (i+1), array[i+1]);
            }
            if(i==(k-1)) {
                System.out.println("╚═══════════════╩═══════════════╝");
                break;
            }

        }
    }
}
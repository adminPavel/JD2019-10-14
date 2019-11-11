package by.it.yaroshenko.jd01_03;

import java.util.Arrays;

/**
 * @author Павел Ярошенко
 * @version 1.1
// * @return
// * @deprecated
// * @since
// * @throws
// * @see
 *
 */
public class Runner {

    public static void main(String[] args) {
        String line = "12 34 56 78 90 123 9";
        double[] array = InOut.getArray(line);
        System.out.println(Arrays.toString(array));
        InOut.printArray(array);
        InOut.printArray(array, "V", 2);


        double [][] matrixLeft = {
                {2,6,88,0,9},
                {7,-4,77,5,98},
                {4,6,1,-3,9},
                {6,4,9,18,0}
        };

        double [][] matrixRight = {
                {12,4,34,-7,9},
                {4,-4,0,5,11},
                {7,13,-92,-3,16},
                {16,14,29,8,-8}
        };

        double[] vector = {1, 3, 4, 5, 6 } ;


        double min = Helper.findMin(array);
        double max = Helper.findMax(array);
        System.out.println(min+ " " + max);

        Helper.sort(array);
       // double [][] matrix_result_2 = Helper.mul();
        System.out.println('\n'+"------------------------------------------------------------------");
        String result_matrix_2 = Helper.toString(Helper.mul(matrixLeft, matrixRight));
        System.out.println(result_matrix_2);
        System.out.println('\n'+"------------------------------------------------------------------");
        String result_matrix_1= Helper.toString(Helper.mul(matrixLeft, vector));
       System.out.println(result_matrix_1);
      System.out.println('\n'+"------------------------------------------------------------------");
    }
}

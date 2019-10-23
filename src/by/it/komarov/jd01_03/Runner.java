package by.it.komarov.jd01_03;

public class Runner {
    public static void main(String[] args) {
        String line = "12 56 34 90 78 123 9";
        double[] array = InOut.getArray(line);
        //System.out.println(Arrays.toString(array));
        double[][] matrix = new double[2][2];
        double[] vector = new double[2];


        InOut.printArray(array);
        InOut.printArray(array, "v", 3);
        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);
        Helper.mul(matrix, vector);
    }
}

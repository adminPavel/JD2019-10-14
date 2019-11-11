package by.it.sermyazhko.jd01_03;


class Runner {
    public static void main(String[] args) {
        String line = "10 -22 -8 4 -3 6 7 8 17 0";
        double[] array = InOut.getArray(line);
        InOut.printArray(array);
        InOut.printArray(array, "V", 2);
        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);
        double[][] arr = new double[][]
        {
            {0,1,2,7,9},
            {2,-3,5,-5,6},
            {5,8,-1,3,0},
            {7,3,-1,0,6}
        };
        double[] mas = new double[] {5,6,9,-13,7};
        Helper.mul(arr, mas);
        //={{22,28},{49,64}}
        double[][] matrixRight = new double[][]
                {
                        {0,1,2,7,9},
                        {2,-3,5,-5,6},
                        {5,8,-1,3,0},
                        {7,3,-1,0,6}
                };
        double[][] matrixLeft = new double[][]
                {
                        {0,1,2,-50},
                        {2,-3,5,-5},
                        {5,8,-0,3},
                        {7,3,-1,0},
                        {2,-0,5,-5},
                        {5,8,0,3},
                        {7,3,-1,0}
                };
        Helper.mul(matrixLeft, matrixRight);
    }
}

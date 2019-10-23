package by.it.akhmelev.jd01_03;

public class Runner {

    public static void main(String[] args) {
        String line=" 12 34 56 78 90 123 9";
        double[] array = InOut.getArray(line);
        InOut.printArray(array);
        InOut.printArray(array,"V",6);
    }

}

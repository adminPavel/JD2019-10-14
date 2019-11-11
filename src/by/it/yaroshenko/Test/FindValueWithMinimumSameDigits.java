package by.it.yaroshenko.Test;

public class FindValueWithMinimumSameDigits {
    public static void main(String[] args) {
       int[] array = {-7, -999, 0, 17, 8097, 678, 2};
        findValueWithMinimumSameDigits(array);
    }
    private static int findValueWithMinimumSameDigits (int[] array) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            int[] value = new int[array[i]];
            for (int j = 0; j < value.length; j++) {
                for (int k = j+1; k < value.length; k++) {
                    if (value[j]==value[k]) {
                        count++;
                    }
                }
            }
        }
        return 0;
    }
}


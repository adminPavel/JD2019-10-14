package by.it.sermyazhko.jd01_04;

public class Helper {

    static void sort(double[ ] arr){
        int count = arr.length-1;
        for (int i = 0; i < arr.length - 1; i++) {
            int transposition = 0;
            for (int j = 0; j < count; j++) {
                if(arr[j]>arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    transposition++;
                }
            }
            //If you do not have transposition - exit -> Array sorted
            if (transposition == 0){
                break;
            }
            count--;
        }
    }

}

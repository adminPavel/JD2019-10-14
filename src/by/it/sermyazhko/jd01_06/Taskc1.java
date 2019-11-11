package by.it.sermyazhko.jd01_06;

import java.util.Arrays;

public class Taskc1 {
    public static void main(String[] args) {
        String[] row = Poem.text.split("\n");
        int[] countSpace = new int[0];
        int maxLength = 0;
        int count = 0;
        for (int i = 0; i < row.length - 1; i++) {
            if(row[i].length() > row[i+1].length()){
                maxLength = row[i].length();
                count = i;
                int c = row[i].split(" ").length;
                countSpace = Arrays.copyOf(countSpace,countSpace.length + 1);
                countSpace[countSpace.length - 1] = c;
            }
            //countSpace = Arrays.copyOf(countSpace,countSpace.length + 1);
            //countSpace[countSpace.length - 1] = 1;
        }

        for (int i = 0; i < row.length; i++) {
            System.out.println(countSpace[i]);
        }



     }
}



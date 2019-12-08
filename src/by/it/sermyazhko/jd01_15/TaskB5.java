package by.it.sermyazhko.jd01_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TaskB5 {
    public static void main(String[] args) {
        String path = getPath(TaskB5.class);
        String fileName = path + ".java";
        System.out.println(fileName);
        StringBuilder sb = new StringBuilder();//comment
        try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {


        }catch(IOException ex)
        {
            ex.printStackTrace();
        }
        System.out.println(sb);
    }




    private static String getPath(Class<TaskB5> bClass) {
        return System.getProperty("user.dir")
                //comment
                + File.separator + "src" + File.separator
                + bClass.getName()
                .replace(".", File.separator);/*comment
                comment
                */
    }
}
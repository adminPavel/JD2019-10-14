package by.it.yaroshenko.testing;

import by.it.yaroshenko.jd01_14.TaskA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class fileWriter {
    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = fileWriter.class.getName().replace(fileWriter.class.getSimpleName(), "").replace(".", File.separator);
        return  path + clDir;
    }
    public static void main(String[] args) throws IOException {
        String str = "ABC";
        try {
            FileWriter fileWriter = new FileWriter(dir() + "result.txt", true);
            for (int i = 0; i < str.length(); i++) {
                fileWriter.write(str.charAt(i));
            }
            System.out.println("Successfully written");
            fileWriter.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

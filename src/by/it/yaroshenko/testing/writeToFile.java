package by.it.yaroshenko.testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {
    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = writeToFile.class.getName().replace(writeToFile.class.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }
   public void whenWriteStringUsingBufferedWritter_thenCorrect() throws IOException {
        String str = "Hello";
       BufferedWriter bw = new BufferedWriter(new FileWriter(dir() + "result.txt"));
       bw.write(str);

       bw.close();
    }
    public static void main(String[] args) {

    }
}

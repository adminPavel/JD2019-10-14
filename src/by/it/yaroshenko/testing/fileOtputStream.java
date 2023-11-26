package by.it.yaroshenko.testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileOtputStream {
    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = fileOtputStream.class.getName().replace(fileOtputStream.class.getSimpleName(), "").replace(".", File.separator);
        return  path + clDir;
    }
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(dir()+"result.txt", true);
            String s = "Write Sucsessfull"+'\n';
            String str ="Add new information";
            fileOutputStream.write(s.getBytes());
            fileOutputStream.close();
            System.out.println(
                    "file is successfully updated!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

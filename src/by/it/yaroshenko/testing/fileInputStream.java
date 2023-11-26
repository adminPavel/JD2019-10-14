package by.it.yaroshenko.testing;
import java.io.File;
import java.io.FileInputStream;

public class fileInputStream {
    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = fileInputStream.class.getName().replace(fileInputStream.class.getSimpleName(), "").replace(".", File.separator);
        return  path + clDir;
    }
    public static void main(String[] args) {
        try {
            FileInputStream fileInpStream = new FileInputStream(dir() + "result.txt");
            int i = 0;
            while((i = fileInpStream.read()) != -1) {
                System.out.print((char)i);
            }
            fileInpStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

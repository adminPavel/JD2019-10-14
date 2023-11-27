package by.it.yaroshenko.testing;

import java.io.*;

public class AppendStrindExistFile {
    public static void appendStrToFile (String fileName, String str) throws IOException {
        try {
            BufferedWriter br = new BufferedWriter(
                    new FileWriter(fileName, true));
            br.write(str);
            br.close();
        } catch (IOException e) {
            System.out.println("exception occurred" + e);
        }
    }

    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = AppendStrindExistFile.class.getName().replace(AppendStrindExistFile.class.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }
    public static void main(String[] args) throws Exception{
        String fileName = "result.txt";
        String str = "This is GeeksforGeeks";
        appendStrToFile(dir() + fileName, str);
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(dir()+"result.txt"));
            String mystring;
            while ((mystring = bufferedReader.readLine()) != null ) {
                System.out.println(mystring);
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
    }
}

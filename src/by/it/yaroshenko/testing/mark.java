package by.it.yaroshenko.testing;
import java.io.*;

public class mark {
    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = mark.class.getName().replace(mark.class.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }
    public static void main(String[] args) throws IOException {

        // Read the stream 'demo.txt'
        // for containing text "GEEKS"
        FileReader fileReader
                = new FileReader(
                dir() + "demo.txt");

        // Convert fileReader to
        // bufferedReader
        BufferedReader buffReader
                = new BufferedReader(
                fileReader);

        // Read and print characters
        // one by one
        System.out.println(
                "Char : "
                        + (char)buffReader.read());
        System.out.println(
                "Char : "
                        + (char)buffReader.read());
        System.out.println(
                "Char : "
                        + (char)buffReader.read());

        // Mark is set on the stream
        buffReader.mark(20); //после ресет() поток начинает выводить с места до mark()
        for (int i = 0; i < 8; i++) {


        System.out.println(
                "Char : "
                        + (char)buffReader.read());
        }
        // Reset() is invoked
       buffReader.reset();

        //Read and print characters
        System.out.println(
                "Char : "
                        + (char)buffReader.read());
        System.out.println(
                "Char : "
                        + (char)buffReader.read());
    }
}
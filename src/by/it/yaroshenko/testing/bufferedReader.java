package by.it.yaroshenko.testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class bufferedReader {
    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = bufferedReader.class.getName().replace(bufferedReader.class.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(dir() + "result.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int size = 40;
        char[] chars = new char[size];
        if (bufferedReader.markSupported()) {
            System.out.println(
                    "mark() method is supported");
            bufferedReader.mark(40);
        }
        bufferedReader.skip(9);
        if (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        bufferedReader.read(chars);
            for (int i = 0; i < 40; i++) {
                if (chars[i] != 0) {
                    System.out.print(chars[i]);
                }
            }
            //System.out.println();
            bufferedReader.reset();
            for (int i = 0; i < 40; i++) {
                if (chars[i] != 0) {
                    System.out.print((char) bufferedReader.read());
                }
            }
        }


    }
}

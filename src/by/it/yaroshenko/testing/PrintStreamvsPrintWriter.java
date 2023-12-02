package by.it.yaroshenko.testing;

import java.io.*;

public class PrintStreamvsPrintWriter {
    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = PrintStreamvsPrintWriter.class.getName().replace(PrintStreamvsPrintWriter.class.getSimpleName(), "").replace(".", File.separator);
        return  path + clDir;
    }
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(dir() + "image.png");
        PrintStream printStream = new PrintStream(dir() + "ps.png");
        int b;
        while ((b=fileInputStream.read())!=-1){
            printStream.write(b);
        }
        printStream.close();

            FileReader fileReader = new FileReader(dir() + "image.png");
            PrintWriter writer = new PrintWriter(dir() + "pw.png");
            int a;
            while ((a = fileReader.read()) != -1) {
                writer.write(a);
            }
        writer.close();
        fileInputStream.close();
    }
    }



package by.it.yaroshenko.testing;

import java.io.*;

public class OutputStreamFileOutputStream {
    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = OutputStreamFileOutputStream.class.getName().replace(OutputStreamFileOutputStream.class.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }

    public static void main(String[] args) throws IOException {
        OutputStream outing = new FileOutputStream(dir() + "result.txt");
        outing.write("footbar".getBytes());
        outing.flush();
        outing.close();

        PrintStream ps = new PrintStream(dir() + "result.txt");
        ps.print("Hello World");
        ps.flush();
        ps.close();

        PrintWriter out = new PrintWriter(dir() + "result.txt");
        out.print("Hello, world!");
        out.flush();
        out.close();

        PrintStream pstream = new PrintStream(new FileOutputStream(dir() + "autoFlushPrintStream.txt"), true);
        pstream.write("Hello, world!\nHello, world!\n".getBytes());
        pstream.close();
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(dir() + "autoFlushPrintStream.txt"), true);
        printWriter.write("Hello WorLLLLLLD");
        printWriter.close();
    }
}

package by.it.yaroshenko.testing;

import org.junit.Test;

import java.io.*;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class writeToFile {
    private static final String dir = dir() + "result.txt";
    private static final String dir2 = dir() + "fileName2.txt";

       private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = writeToFile.class.getName().replace(writeToFile.class.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }
   public static void whenWriteStringUsingBufferedWritter_thenCorrect() throws IOException {
        String str = "Hello";
       BufferedWriter bw = new BufferedWriter(new FileWriter(dir));
       bw.write(str);

       bw.close();
    }

    @Test
    public static void whenAppendStringUsingBufferedWritter_thenOldContentShouldExistToo() throws IOException {
        String str = "World";
        BufferedWriter bw = new BufferedWriter(new FileWriter(dir, true));
        bw.append(" ");
        bw.append(str);
        bw.close();
    }
    @Test
    public static void givenWritingStringToFile_whenUsingPrintWriter_thenCorrect() throws IOException {
       FileWriter fw = new FileWriter(dir);
       PrintWriter pw = new PrintWriter(fw, true);
       pw.print("Some String");
       pw.printf("Product name is %s and its price is %d $", "iPhone", 1000);
       pw.close();
    }

    @Test
    public static void givenWritingToFile_whenUsingDataOutputStream_thenCorrect() throws IOException {
           String value = "Hello";
           String value1 = "Error";
           FileOutputStream fileOutputStream = new FileOutputStream(dir);
           DataOutputStream dataOutputStream =new DataOutputStream(new BufferedOutputStream(fileOutputStream));
           dataOutputStream.writeUTF(value);
           dataOutputStream.close();

           String result;
           FileInputStream fis = new FileInputStream(dir);
           DataInputStream dis = new DataInputStream(fis);
           result = dis.readUTF();
           dis.close();

           assertEquals(value, result);
    }
    private static void writeToPosition(String filename, String data, long position) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filename, "rw");
        raf.seek(position);
        raf.writeUTF(data);
        raf.close();
    }
    private static String readFromPosition(String filename, long position)
            throws IOException {
        String result = null;
        RandomAccessFile reader = new RandomAccessFile(filename, "r");
        reader.seek(position);
        result = reader.readUTF();
        reader.close();
        return result;
    }
    @Test
    public static void whenWritingToSpecificPositionInFile_thenCorrect()
            throws IOException {
        String data1 = "2014";
        String data2 = "1500";

        writeToPosition(dir, data1, 4);
        assertEquals(data1, readFromPosition(dir, 4));
        writeToPosition(dir2, data2, 4);
        assertEquals(data2, readFromPosition(dir2, 4));

    }

    public static void main(String[] args) throws IOException {
        whenWriteStringUsingBufferedWritter_thenCorrect();
        whenAppendStringUsingBufferedWritter_thenOldContentShouldExistToo();
        givenWritingStringToFile_whenUsingPrintWriter_thenCorrect();
        givenWritingToFile_whenUsingDataOutputStream_thenCorrect();
        whenWritingToSpecificPositionInFile_thenCorrect();
    }
}

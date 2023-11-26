package by.it.yaroshenko.testing;

import by.it.yaroshenko.jd01_14.TaskA;

import java.io.*;

public class dataOutputStream {
    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = dataOutputStream.class.getName().replace(dataOutputStream.class.getSimpleName(), "").replace(".", File.separator);
        return  path + clDir;
    }
    public static void main(String[] args) throws IOException {
        try(DataOutputStream dout =
                       new DataOutputStream(
                           new BufferedOutputStream(
                               new FileOutputStream(dir() + "file.dat")))){
            dout.writeDouble(1.1);
            dout.writeInt(55);
            dout.writeBoolean(true);
            dout.writeChar('4');
        } catch (FileNotFoundException ex) {
            System.out.println("Cannot Open the Output File");
            return;
        }
        try ( DataInputStream din =
                      new DataInputStream(
                              new BufferedInputStream(
                                      new FileInputStream(dir() + "file.dat")))) {
            double a = din.readDouble();
            int b = din.readInt();

            boolean c = din.readBoolean();
            char d = din.readChar();
                try (PrintWriter out2 = new PrintWriter(new FileWriter(dir() + "result.txt"))) {
                    out2.print("Values: " + a + " " + b + " " + c + " " + d);
                }
            System.out.println("Values: " + a + " " + b + " " + c + " " + d);
        }

        // Catch block to handle FileNotFoundException
        catch (FileNotFoundException e) {
            System.out.println("Cannot Open the Input File");
            return;
        }

    }
}

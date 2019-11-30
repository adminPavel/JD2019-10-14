package by.it.kharitonenko.jd01_15;

import java.io.*;

public class TaskB {
    /**
     * Finds and returns as String value the directory of class.
     *
     * @param cl class name
     * @return directory in which cl resides
     */
    private static String dir(Class<?> cl) {
        return System.getProperty("user.dir") + File.separator + ("src") +
                File.separator + cl.getName().
                replace(cl.getSimpleName(), "").
                replace(".", File.separator);
    }
    //string builder method
    static void readSource() {
        boolean canWrite;
        boolean longComment = false;
        String temp;
        String original;
        try (BufferedReader reader = new BufferedReader(new FileReader(dir(TaskB.class) + "TaskB.java"));
             PrintWriter writer = new PrintWriter(new FileWriter(dir(TaskB.class) + "TaskB.txt"))) {
            while (reader.ready()) {
                original = reader.readLine();
                temp = original.trim();
                canWrite = true;
                if (temp.startsWith("//")) canWrite = false;
                if (temp.startsWith("/*")) {
                    canWrite = false;
                    longComment = true;
                }
                if (temp.startsWith("/**")) {
                    canWrite = false;
                    longComment = true;
                }
                //write line
                if (canWrite && !longComment) {
                    System.out.println(original);
                    writer.println(original);
                } else {
                    if (temp.startsWith("*/")) {
                        longComment = false;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    comments
     */
    public static void main(String[] args) {
        /*
        more comments
         */
        readSource();
    }
}

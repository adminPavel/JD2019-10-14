package by.it.sermyazhko.jd01_15;

import java.io.*;

/**
 * path
 * **
 */
public class TaskB {
    public static void main(String[] args) {
        String path = getPath(TaskB.class);
        System.out.println(path);
        String filename = path + ".java";
        StringBuilder newCode = new StringBuilder();
        try (BufferedReader sr = new BufferedReader(new FileReader(filename))) {
            boolean block= false;
            boolean stroka = false;
            boolean out = true; /* привет
                        привет
                         */
            int prev = sr.read();
            int cur;
            for (cur = sr.read(); cur != -1; cur = sr.read()) {
                if (block) {
                    if (prev == '*' && cur == '/') {
                        block = false;
                        out = false;
                    }
                } else if (stroka) {
                    if (cur == '\r') {
                        /* привет
                        привет
                         */
                        sr.mark(1);
                        int next = sr.read();
                        if (next != '\n') {
                            sr.reset();
                        }
                        stroka = false;
                        out = false;
                    } else if (cur == '\n') {
                        stroka = false;
                        out = false;
                    }
                } else {
                    if (prev == '/' && cur == '*') {
                        sr.mark(1);
                        int next = sr.read(); // коммент
                        if (next != '*') {
                            block = true; // коммент
                        }
                        sr.reset();
                    } else if (prev == '/' && cur == '/') {
                        stroka = true;
                    } else if (out) {
                        newCode.append((char) prev);
                    } else {
                        out = true;
                    }
                }
                prev = cur;
            }
            if (prev != -1 && out && !stroka) {
                newCode.append((char) prev);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newCode);

        try (FileWriter f = new FileWriter(path+".txt")) {
            f.append(newCode);
            f.write("\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static String getPath(Class<TaskB> bClass) {
        return System.getProperty("user.dir")
                + File.separator + "src" + File.separator +
                bClass
                        .getName()
                        //.replace(bClass.getName(), "")
                        .replace(".", File.separator);
    }
}

package by.it.sermyazhko.jd01_15;

import java.io.*;
/**
 * TaskB
 main*/
public class TaskB {
//comment
    public static void main(String[] args) {
        String path = getPath(TaskB.class);
        String fileName = path + ".java";
        System.out.println(fileName);//comment
        StringBuilder sb = new StringBuilder();
        try (BufferedReader sr = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = sr.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(remove(sb));

        try (FileWriter f = new FileWriter(path+".txt")) {
            f.append(sb);
            f.write("\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    private static StringBuilder remove(StringBuilder sb) {
        int start;
        int end;
        while ((start = sb.indexOf("//")) >= 0 && (end = sb.indexOf("\n", start)) >= 0) {
            sb.delete(start, end);
        }
        while ((start = sb.indexOf("/*")) >= 0 && (end = sb.indexOf("*/")) >= 0) {
            sb.delete(start, end + 2);
        }
        return sb;
    }

    private static String getPath(Class<TaskB> bClass) {
        return System.getProperty("user.dir")
                //comment
                + File.separator + "src" + File.separator
                + bClass.getName()
                .replace(".", File.separator);
            /*comment
            comment
            */
    }
}

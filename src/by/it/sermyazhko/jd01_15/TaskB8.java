package by.it.sermyazhko.jd01_15;

import java.io.*;
/**
 * TaskB
 main*/
public class TaskB8 {
    //comment
    public static void main(String[] args) {
        String path = getPath(TaskB8.class);
        String fileName = path + ".java";
        System.out.println(fileName);
        StringBuilder sb = new StringBuilder();//comment
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = br.readLine())!=null) {

                if (line.contains("//")) {
                    int startIndex = line.indexOf("//");
                    int endIndex = line.length();
                    String temp = line.substring(startIndex, endIndex);
                    line = line.replace(temp, "");
                    //line = line.replace("\n", "");
                    //sb.append("\r");

                }

                if(line.contains("/*")){
                    int startIndex = line.indexOf("/*");
                    int endIndex = line.length();
                    String temp = line.substring(startIndex, endIndex);
                    line.replace(temp, "");
                    while((line = br.readLine())!=null){
                       if(!line.contains("*/"))
                        continue;
                        else{
                            int start = 0;
                            int end = line.length();
                            String tem = line.substring(start, end);
                            line = line.replace(tem, "");
                            break;
                        }

                    }
                }
                sb.append(line);
                sb.append("\n");
               /* if(line.length()>0) {
                    if (line.charAt(line.length() - 1) != ' ') {
                        sb.append("\n");
                    }
                }*/
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(sb);
      try (FileWriter f = new FileWriter(path+".txt")) {
           f.append(sb);
             f.write("\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private static String getPath(Class<TaskB8> bClass) {
        return System.getProperty("user.dir")
                //comment
                + File.separator + "src" + File.separator
                + bClass.getName()
                .replace(".", File.separator);/*comment
                comment
                */
    }
}

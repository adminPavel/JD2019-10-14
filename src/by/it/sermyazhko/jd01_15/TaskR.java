package by.it.sermyazhko.jd01_15;

import java.io.*;
/**
 * TaskB
 main*/
public class TaskR {
    //comment
    public static void main(String[] args) {
        String path = getPath(TaskR.class);
        String fileName = path + ".java";
        System.out.println(fileName);
        StringBuilder newCode = new StringBuilder();//comment
       // try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
       // } catch (IOException ex) {
        //    ex.printStackTrace();
      //  }
       // System.out.println(sb);
       // try (FileWriter f = new FileWriter(path+".txt")) {
           // f.append(sb);
           // f.write("\n");
       // } catch (IOException ex) {
      //      ex.printStackTrace();
      //  }
        StringBuilder sb = new StringBuilder();
        boolean del = false;
        try (BufferedReader sr = new BufferedReader(new FileReader(fileName))) {


            while (sr.ready()) {
                String line = sr.readLine();
                if(line.startsWith("//")){
                    //line.replace
                    String temp = line.substring(line.indexOf("//"),line.length()-1);
                    line.replace(temp,"");
                }
                else if(line.startsWith("/*") | line.startsWith("/**")){
                    del = true;
                }
                else if (del == false) {
                    sb.append(line)
                    .append(System.lineSeparator());
                }
                else if(line.endsWith("*/")) {
                    del = false;

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
    }




    private static String getPath(Class<TaskR> bClass) {
        return System.getProperty("user.dir")
                //comment
                + File.separator + "src" + File.separator
                + bClass.getName()
                .replace(".", File.separator);/*comment
                comment
                */
    }
}

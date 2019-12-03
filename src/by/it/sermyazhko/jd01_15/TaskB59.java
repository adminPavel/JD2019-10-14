package by.it.sermyazhko.jd01_15;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TaskB59 {
    /**
     * The main method.
     *
     * @param args
     * the arguments
     * @throws Exception
     * the exception
     */
    public static void main(String args[]) throws Exception {
       // String[] imports = new String[100];
        String path = getPath(TaskB59.class);
        //System.out.println(path);
        String fileName = path + ".java";
        StringBuilder sb = new StringBuilder();

        // This will reference one API at a time
        //String line = null;
        try {

            FileReader fileReader = new FileReader(fileName);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int startingOffset = 0;
            // This will reference one API at a time
            List<String> lines = Files.readAllLines(Paths.get(fileName),
                    Charset.forName("ISO-8859-1"));
            // remove single line comments
            for (int count = 0; count < lines.size(); count++) {
                String tempString = lines.get(count);
                lines.set(count, removeSingleLineComment(tempString));
            }
            // remove multiple lines comment
            for (int count = 0; count < lines.size(); count++) {
                String tempString = lines.get(count);
                removeMultipleLineComment(tempString, count, lines);
            }
            for (int count = 0; count < lines.size(); count++) {
                System.out.println(lines.get(count));
                sb.append(lines.get(count));
                sb.append('\n');


            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");

        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        } catch (Exception e) {
        }
        try (FileWriter f = new FileWriter(path+".txt")) {
            f.append(sb);
        }

    }

    /**
     * Removes the multiple line comment.
     *
     * @param tempString
     * the temp string
     * @param count
     * the count
     * @param lines
     * the lines
     * @return the string
     */
    private static List<String> removeMultipleLineComment(String tempString,
                                                          int count, List<String> lines) {
        try {
            if (tempString.contains("/**") || (tempString.contains("/*"))) {
                int StartIndex = count;
                while (!(lines.get(count).contains("*/") || lines.get(count)
                        .contains("**/"))) {
                    count++;
                }
                int endIndex = ++count;
                if (StartIndex != endIndex) {
                    while (StartIndex != endIndex) {
                        lines.set(StartIndex, "");
                        StartIndex++;
                    }
                }
            }
        } catch (Exception e) {
            // Do Nothing
        }
        return lines;
    }
    /**
     * Remove single line comments .
     *
     * @param line
     * the line
     * @return the string
     * @throws Exception
     * the exception
     */
    private static String removeSingleLineComment(String line) throws Exception {
        try {
            if (line.contains(("//"))) {
                int startIndex = line.indexOf("//");
                int endIndex = line.length();
                String tempoString = line.substring(startIndex, endIndex);
                line = line.replace(tempoString, "");
            }
            if ((line.contains("/*") || line.contains("/**"))
                    && (line.contains("**/") || line.contains("*/"))) {
                int startIndex = line.indexOf("/**");
                int endIndex = line.length();
                String tempoString = line.substring(startIndex, endIndex);
                line = line.replace(tempoString, "");
            }
        } catch (Exception e) {
            // Do Nothing
        }
        return line;
    }

    private static String getPath(Class<TaskB59> bClass) {
        return System.getProperty("user.dir")
                + File.separator + "src" + File.separator +
                bClass
                        .getName()
                        //.replace(bClass.getName(), "")
                        .replace(".", File.separator);
    }

}

package by.it.kazak.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {
        String st = Poem.text.replace("...", "");
        String[] ss = st.split("[.!]+");
        replace(ss);
        cs(ss);
        for (String s : ss) {
            System.out.println(s);
        }
    }

    private static void replace(String[] ss) {
        for (int i = 0; i < ss.length; i++) {
            ss[i] = ss[i].replace(",\n", " ");
            ss[i] = ss[i].replace("\n", " ");
            ss[i] = ss[i].replace(",", " ");
            ss[i] = ss[i].replace(" - ", " ");
            ss[i] = ss[i].replace(" : ", " ");
            ss[i] = ss[i].trim();
        }
    }

    private static void cs(String[] ss) {
        boolean sp;
        int l = ss.length - 1;
        do {
            sp = false;
            for (int i = 0; i < l; i++) {
                if (ss[i].length() > ss[i + 1].length()) {
                    String c = ss[i];
                    ss[i] = ss[i + 1];
                    ss[i + 1] = c;
                    sp = true;
                }
            }
            l--;
        } while (sp);
    }
}


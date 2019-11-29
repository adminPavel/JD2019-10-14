package by.it.yaroshenko.jd01_15;
/*
В программе создайте хотя бы 5 разных комментариев: 2 однострочных, 2 многострочных и 1 JavaDoc
 Программа должна прочитать свой собственный текст в переменную типа StringBuilder.
 Читая программу необходимо удалить все возможные виды комментариев, не трогая остальное.
 Результат вывести на консоль и в файл с тем же местоположением и именем, но с расширением txt, а не java.
 Считайте, что комментарии внутри строки невозможны (s=“//так не бывает”) и внутри комментария тоже
 */

/**
 * Читаем файл в переменную StringBuilder
 * @author Pavel Yaroshenko
 * @param filePath имя файла для чтения
 * @param filePathToWrite  имя файла для записи
 * @version 2019-11-29
 *
 */

import java.io.*;

public class TaskB {
    public static void main(String[] args) {

        String filePath = "E:\\yaroshenko\\JD2019-10-14ver02\\src\\by\\it\\yaroshenko\\jd01_15\\TaskB.java";
        String filePathToWrite = "E:\\yaroshenko\\JD2019-10-14ver02\\src\\by\\it\\yaroshenko\\jd01_15\\TaskB.txt";
        StringBuilder stringBuilder = new StringBuilder();

        //readText
        try(FileReader reader = new FileReader(filePath)) {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                stringBuilder.append((char) c);
            }
            System.out.print(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //writeIntoFile
        PrintWriter fileWriter = null;
        try {
            fileWriter = new PrintWriter(filePathToWrite);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fileWriter != null;
        fileWriter.write(String.valueOf(stringBuilder));
        fileWriter.flush();
        fileWriter.close();



        //deleteCommit
        try(FileReader reader = new FileReader(filePathToWrite)) {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                stringBuilder.append((char) c);
            }
            System.out.print(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//        У лукоморья дуб зелёный,
//        Златая цепь на дубе том.

//                И днём и ночью кот учёный
//        Всё ходит по цепи кругом.

/*                Идёт направо - песнь заводит,
                Налево - сказку говорит.
                Там чудеса: там леший бродит,
                Русалка на ветвях сидит.
                */


/*                Идёт направо - песнь заводит,
                Налево - сказку говорит.
                Там чудеса: там леший бродит,
                Русалка на ветвях сидит.
                */
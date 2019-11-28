package by.it.komarov.jd01_14;

import java.io.*;

public class TaskA {
    // функция для определения текущей дериктории в котой находится наш класс
    private static String dir(Class<?> cl){
        // определяем где находится каталог проекта
        // File.separator - разделитель вводящий слэши (универсальный под Mac и Windows)
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        // Получаем информацияю из полученного класса
        // get.name() - получаем полный путь к классу
        // get.simpleName - получение только имени класса
        String clDir = cl.getName().replace(cl.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }
    public static void main(String[] args) {
        // определяем каталог в который будем записывать файл

        // оозначаем как пустое множество, чтобы в блоке try мы заранее не знали чем закончится раота с DOS
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dir(TaskA.class)+"dataTaskA.bin")));
            for (int i = 0; i < 20; i++) {
                // записываем в файловый поток
                dos.writeInt((int) (Math.random() * 25));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // процедура закрытия файла
        finally {
            if(dos != null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        // try с ресурсами, доступен с 7 версии Java
        try(DataInputStream inp = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(dir(TaskA.class)+"dataTaskA.bin")));
         // новый текстовый файловый вывод
        PrintWriter out = new PrintWriter(
                new FileWriter(dir(TaskA.class)+ "resultTaskA.txt"))
        ) {

            double sum = 0;
            double count = 0;
            // available() - есть ли что-то доступное в файле
            while (inp.available() > 0){
                int i = inp.readInt();
                System.out.print(i + " ");
                out.print(i + " ");
                sum += i;
                count++;

            }
            System.out.println("\navg=" + sum/count);
            out.print("\navg=" + sum/count);
        } catch (IOException e) {
            e.printStackTrace();
        }


        // TaskA.class - получаем структуру класса TaskA
        // System.out.println(dir(TaskA.class));
    }
}

package by.it.yaroshenko.testing;

import org.junit.Test;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class classFiles {
    private static final String dir = dir() + "result.txt";
    private static final String dir2 = dir() + "fileName2.txt";

    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = classFiles.class.getName().replace(classFiles.class.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }
    @Test
    public static void givenUsingJava7_whenWritingToFile_thenCorrect() throws IOException {
        String str = "Hello java " + "\n" + "Second line";

        String[] array = str.split("\\n");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        Path path = Paths.get(dir);
        byte[] b = str.getBytes();
        Files.write(path, b);
        for (int i = 0; i < array.length; i++) {
            String read = Files.readAllLines(path).get(i);
            assertEquals(array[i], read);
        }
        //  String read = Files.readAllLines(path).get(0);
        //assertEquals(str, read);
    }

    public static void whenWriteToTmpFile_thenCorrect() throws IOException {
        String toWrite = "Hello yo";
        File file = File.createTempFile("test", ".tmp");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(toWrite);
        fileWriter.close();

        BufferedReader br = new BufferedReader(new FileReader(file));
        assertEquals(toWrite, br.readLine());
        br.close();
    }
    @Test
    public static void whenTryToLockFile_thenItShouldBeLocked() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(dir, "rw");
        FileChannel channel = raf.getChannel();
        FileLock fileLock = null;
        try {
             fileLock = channel.tryLock();
        } catch (final OverlappingFileLockException e) {
            raf.close();
            channel.close();
        }
        raf.writeUTF("test lock");
        assert fileLock != null;
        fileLock.release();

        raf.close();
        channel.close();
    }
    public static void main(String[] args) throws IOException {
      //  givenUsingJava7_whenWritingToFile_thenCorrect();
        whenWriteToTmpFile_thenCorrect();
        whenTryToLockFile_thenItShouldBeLocked();
    }
}

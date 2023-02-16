package IO._02;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileMethodTest01
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 12:41
 * @Version 1.0
 **/
public class FileMethodTest01 {
    public static void main(String[] args) {
        /*
        boolean	createNewFile()
        Atomically creates a new, empty file named
        by this abstract pathname if and only if a file with this name
        does not yet exist.

        boolean	mkdir()
        Creates the directory named by this abstract pathname.
        boolean	mkdirs()
        Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories.
         */
        File file = new File("C:\\Users\\long\\Desktop\\Test\\test.txt");
        File file1 = new File("C:\\Users\\long\\Desktop\\Test");
        try {
            boolean flag = file.createNewFile();
            System.out.println(flag);
            boolean flag1 = file1.createNewFile();
            System.out.println(flag1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

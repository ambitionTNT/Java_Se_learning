package IO._02;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.FileFilter;

/**
 * @ClassName FileMethodTest03
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 13:04
 * @Version 1.0
 **/

/**
 * test the method of  exists,isDirectory,isFile
 */
public class FileMethodTest03 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\long\\Desktop\\Test");
        File file2 = new File("C:\\Users\\long\\Desktop\\Test\\test\\hello");
        File file1 = new File("C:\\Users\\long\\Desktop\\Test\\test.txt");

        System.out.println(file.exists());
        System.out.println(file2.exists());

        System.out.println(file.isFile());
        System.out.println(file1.isFile());

        System.out.println(file.isDirectory());
        System.out.println(file1.isDirectory());
    }


}

package IO._01;

import javax.swing.*;
import java.io.File;

/**
 * @ClassName FileTest01
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 12:32
 * @Version 1.0
 **/
public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\long\\Desktop\\Test");
        File file1 = new File("com");
        System.out.println(file);
        File file2 = new File("C:\\Users\\long\\Desktop\\","Test");
        File parentFile = new File("C:\\Users\\long\\Desktop\\");
        File file3 = new File(parentFile,"Test");
        System.out.println(file3);

        System.out.println(file3);
    }
}

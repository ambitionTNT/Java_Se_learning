package IO._02;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileMethodTest04
 * @Description Test the method of delete
 * @Author long
 * @Date 2022/12/25 16:04
 * @Version 1.0
 **/
public class FileMethodTest04 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\long\\Desktop\\Test\\test\\a\\b\\c");

        System.out.println(file.delete());


        File file1 = new File("C:\\Users\\long\\Desktop\\Test\\text.txt");
        try {
            System.out.println(file1.createNewFile());

        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("C:\\Users\\long\\Desktop\\Test\\text.txt");
        System.out.println(file2.length());


    }
}

package IO._05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @ClassName FileOutputTest01
 * @Description TODO
 * @Author long
 * @Date 2022/12/26 11:43
 * @Version 1.0
 **/
public class FileOutputTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\long\\Desktop\\Test\\11.txt");
        File file = new File("C:\\Users\\long\\Desktop\\Test\\11.txt");
        FileOutputStream fos2 = new FileOutputStream(file);

    }
}

package IO._05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileOutputTest02
 * @Description TODO
 * @Author long
 * @Date 2022/12/26 16:40
 * @Version 1.0
 **/
public class FileOutputTest02 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\long\\Desktop\\Test\\11.txt");
        FileOutputStream fos = new FileOutputStream(file,true);//追加写
        byte[] bytes = "abc".getBytes();
        fos.write(bytes);
        fos.close();
    }
}

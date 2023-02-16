package IO._04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName FileInputStreamTest02
 * @Description TODO
 * @Author long
 * @Date 2022/12/26 10:27
 * @Version 1.0
 **/
public class FileInputStreamTest02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\long\\Desktop\\Test\\11.txt");
        byte[] bytes = new byte[2];
        int len;
        while ((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes, 0, len));
        }



        fis.close();
    }
}

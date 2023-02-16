package IO._04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName FileInputStreamTest01
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 21:26
 * @Version 1.0
 **/
public class FileInputStreamTest01 {
    public static void main(String[] args) throws IOException {
        //創建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\long\\Desktop\\Test\\11.txt");
        System.out.println(fis);
        File file = new File("C:\\Users\\long\\Desktop\\Test\\11.txt");
        FileInputStream fis2 = new FileInputStream(file);
        System.out.println(fis2);

        int b ;
        while ((b = fis.read())!=-1){
            System.out.println(b);
        }
        fis.close();

        System.out.println("------------------------------------------------------------");
        //一次读取一个数组
        byte[] bytes = new byte[5];
        int len = fis2.read(bytes);
        System.out.println(len);
        String s = new String(bytes, 0, len);
        System.out.println(s);
        fis2.close();
    }
}

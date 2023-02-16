package IO._06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FileWriterTest02
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 11:26
 * @Version 1.0
 **/
public class FileWriterTest02 {
    public static void main(String[] args) throws IOException {
        //创建流对象
        FileWriter fw = new FileWriter("C:\\Users\\long\\Desktop\\Test\\11.txt",true);
        //写数据,一次写一个字符数组
        char[] chars = "Hello World".toCharArray();
        fw.write(chars);
        fw.close();
    }
}

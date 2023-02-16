package IO._06;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FileReaderTest03
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 10:58
 * @Version 1.0
 **/
public class FileWriterTest01 {
    public static void main(String[] args) throws IOException {
        //创建流对象
        FileWriter fw = new FileWriter("C:\\Users\\long\\Desktop\\Test\\11.txt");
        FileWriter fw2 = new FileWriter(new File("C:\\Users\\long\\Desktop\\Test\\11.txt"));
        //写数据,一次写一个字符
          fw.write('张');
          fw.write('传');
          fw.write('龙');

          fw.close();

    }
}

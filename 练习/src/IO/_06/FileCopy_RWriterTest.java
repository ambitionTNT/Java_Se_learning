package IO._06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FileCopy_RWiterTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 11:40
 * @Version 1.0
 **/
public class FileCopy_RWriterTest {
    public static void main(String[] args) throws IOException {
        //创建流对象
        FileWriter fw = new FileWriter("C:\\Users\\long\\Desktop\\Test2\\22.txt");
        FileReader fr = new FileReader("C:\\Users\\long\\Desktop\\Test\\11.txt");
        //循环读写
        int len;
        char[] chars = new char[1024];
        while ((len = fr.read(chars))!=-1){
            //把读到的内容写入新文件中
            fw.write(chars, 0,len);

        }
        fw.close();
        fr.close();


    }
}

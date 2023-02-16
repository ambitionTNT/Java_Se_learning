package IO._06;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FileWriterTest03
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 11:33
 * @Version 1.0
 **/
public class FileWriterTest03 {
    public static void main(String[] args) throws IOException {
        //创建流对象
        FileWriter fw = new FileWriter("C:\\Users\\long\\Desktop\\Test\\11.txt",true);
        //写数据,一次写一个字符串
        String str = "我爱你中国";
        fw.write(str,0,2);
        fw.close();
    }
}

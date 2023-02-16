package IO._07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName BufferedMethodTest01
 * @Description 测试  String readLine()读一行不包括换行符,void newLine()写入一个换行符
 * @Author long
 * @Date 2022/12/27 16:08
 * @Version 1.0
 **/
public class BufferedMethodTest01 {
    public static void main(String[] args) throws IOException {
        //创建对象，测试readLine
        BufferedReader  br = new BufferedReader(new FileReader("C:\\Users\\long\\Desktop\\Test\\11.txt"));
        String line  = null;
        while ((line = br.readLine())!=null){
            //把读入的内容输出
            System.out.println(line);
        }


    }
}

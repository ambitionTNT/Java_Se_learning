package IO._07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName BufferedMethodTest02
 * @Description testing the method of newLine()
 * @Author long
 * @Date 2022/12/27 16:16
 * @Version 1.0
 **/
public class BufferedMethodTest02 {
    public static void main(String[] args) throws IOException {
        //创建对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\long\\Desktop\\Test\\33.txt"));
        //写入数据
        bw.write("你好啊");
        //写入换行符
        bw.newLine();
        bw.write("I'm OK");
        bw.close();

    }
}

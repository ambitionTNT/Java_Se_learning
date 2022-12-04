import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest01 {
    /**
     * 文件字节输出流，负责写。
     * 从内存到硬盘。
     */
    public static void main(String[] args) {
        FileOutputStream fos = null;
        // myfile文件不存在的时候会自动新建！
        // 这种方式谨慎使用，这种方式会先将原文件清空，然后重新写入。
        // 以追加的方式在文件末尾写入。不会清空原文件内容。
        try {
            fos = new FileOutputStream("ioTest//src//myfile",true);
            byte[] bytes = {97,98,99,100,101,102};
            // 将byte数组全部写出！
            fos.write(bytes);
            fos.write(bytes,0,2);
            // 字符串
            String s = "我是一个中国人，我叫骄傲";
            // 将字符串转换成byte数组。
            byte[] bytes1 =s.getBytes();
            fos.write(bytes1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}

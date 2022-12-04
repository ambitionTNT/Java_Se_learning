import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest05 {
    /*
    FileInputStream类的其它常用方法：
    int available()：返回流当中剩余的没有读到的字节数量
    long skip(long n)：跳过几个字节不读。
 */
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("ioTest//src//tempFile01");
            System.out.println("总字节数："+fis.available());
            // 读1个字节
            //int readByte = fis.read();
            // 还剩下可以读的字节数量是：124
            //System.out.println("剩下的字节数："+fis.available());
            // 这个方法有什么用？
            fis.skip(10);
            // skip跳过几个字节不读取，这个方法也可能以后会用！
            byte[] bytes = new byte[fis.available()]; // 这种方式不太适合太大的文件，因为byte[]数组不能太大。
            // 不需要循环了。
            // 直接读一次就行了。
            //int readCount = fis.read(bytes); // 6
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes));



            System.out.println(fis.read()); //100
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

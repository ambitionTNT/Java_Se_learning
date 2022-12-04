import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest03 {
    /*
 int read(byte[] b)
     一次最多读取 b.length 个字节。
     减少硬盘和内存的交互，提高程序的执行效率。
     往byte[]数组当中读。
  */
    public static void main(String[] args) {
        FileInputStream fis = null;
        // 相对路径的话呢？相对路径一定是从当前所在的位置作为起点开始找！
        // IDEA默认的当前路径是哪里？工程Project的根就是IDEA的默认当前路径。
        //fis = new FileInputStream("tempfile3");
        //fis = new FileInputStream("chapter23/tempfile2");
        //fis = new FileInputStream("chapter23/src/tempfile3");
        try {
            fis = new FileInputStream("ioTest\\tempFile");
            // 开始读，采用byte数组，一次读取多个字节。最多读取“数组.length”个字节。
            byte[] bytes = new byte[4]; // 准备一个4个长度的byte数组，一次最多读取4个字节。

            /*System.out.println(readData);
            // 将字节数组全部转换成字符串
            System.out.println(new String(bytes)); // abcd
            readData = fis.read(bytes);
            System.out.println(new String(bytes));
            readData = fis.read(bytes);
            System.out.println(new String(bytes));
            readData = fis.read(bytes);
            System.out.println(new String(bytes));
*/
            // 不应该全部都转换，应该是读取了多少个字节，转换多少个。
            int readData = fis.read(bytes);
            System.out.println(new String(bytes,0,readData));
            readData = fis.read(bytes);
            System.out.println(new String(bytes,0,readData));
            readData = fis.read(bytes);
            System.out.println(new String(bytes,0,readData));
            readData = fis.read(bytes);
            System.out.println(new String(bytes,0,readData));
            readData = fis.read(bytes);
            System.out.println(readData);// 1个字节都没有读取到返回-1

            // 不应该全部都转换，应该是读取了多少个字节，转换多少个。

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

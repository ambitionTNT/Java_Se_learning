import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy01 {
    /*
使用FileInputStream + FileOutputStream完成文件的拷贝。
拷贝的过程应该是一边读，一边写。
使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么样的文件都能拷贝。
 */
    public static void main(String[] args) throws IOException {

        FileInputStream fis =null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:\\JAVA学习\\笔记\\IO.txt");
            fos = new FileOutputStream("C:\\Users\\long\\Desktop\\新建文本文档.txt");
            byte[] bytes = new byte[1024*1024];
            int readCount = 0;
            while ((readCount = fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (fis!=null){
                fis.close();
            }
            if (fos!=null){
                fos.close();
            }
        }


    }
}

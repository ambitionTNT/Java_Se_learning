import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
使用FileReader FileWriter进行拷贝的话，只能拷贝“普通文本”文件。
 */
public class FileCopy02 {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\JAVA学习\\笔记\\IO.txt");
            fw = new FileWriter("C:\\Users\\long\\Desktop\\新建文本文档.txt");
            char[] chars = new char[512];
            int readCount = 0;
            while ((readCount=fr.read(chars))!=-1){
                fw.write(chars);
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

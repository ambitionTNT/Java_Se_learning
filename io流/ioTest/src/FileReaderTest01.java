import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    /*
FileReader：
    文件字符输入流，只能读取普通文本。
    读取文本内容时，比较方便，快捷。
 */
    public static void main(String[] args) {
        FileReader fr =null;
        try {
            fr = new FileReader("ioTest//src//tempFile01");

            char[] chars = new char[1024];

            int readCount=fr.read(chars);
            System.out.println(readCount);
            System.out.println(new String(chars));
           /* for (char c :chars){
                System.out.println(c);
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

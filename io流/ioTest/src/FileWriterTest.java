import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter:
    文件字符输出流。写。
    只能输出普通文本。
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("myfile01",true);
            char[] chars = {'H','i','i','i'};
            fw.write(chars);
            String s = "农夫山泉，饮用天然水";

            fw.write(s);

            fw.write(s,0,4);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

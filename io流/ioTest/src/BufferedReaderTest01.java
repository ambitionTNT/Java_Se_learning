import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader:
    带有缓冲区的字符输入流。
    使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲。
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("ioTest//src//FileCopy01.java");
            // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
            // 外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
            // 像当前这个程序来说：FileReader就是一个节点流。BufferedReader就是包装流/处理流。
            BufferedReader in = new BufferedReader(fr);
            String s1 = in.readLine();
            System.out.println(s1);
            // br.readLine()方法读取一个文本行，但不带换行符。
            String s2 = in.readLine();
            System.out.println(s2);
            String s3 = in.readLine();
            System.out.println(s3);
            String s4 = in.readLine();
            System.out.println(s4);
            String s5 = in.readLine();
            System.out.println(s5);
            String s = null;
            while((s = in.readLine()) != null){
                System.out.print(s);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

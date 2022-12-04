import java.io.*;

public class BufferedWriterTest {
    /*
   BufferedWriter：带有缓冲的字符输出流。
   OutputStreamWriter：转换流
    */
    public static void main(String[] args) {
        // 带有缓冲区的字符输出流
        //BufferedWriter out = new BufferedWriter(new FileWriter("copy"));

        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy")));
            bw.write("helloasfsafassfasfas");
            bw.write("\n");

            bw.write("hello kitty!");
            bw.flush();
            bw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

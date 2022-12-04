import java.io.*;

public class BufferedReaderTest02 {

    /*
        转换流：InputStreamReader
     */
    public static void main(String[] args) {
        //字节输入流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("ioTest//src//FileCopy01.java");
            /*// in是节点流。reader是包装流。
            //字节流转换为了字符流
            InputStreamReader isr = new InputStreamReader(fis);
            // 这个构造方法只能传一个字符流。不能传字节流。
            BufferedReader br = new BufferedReader(isr);*/
            //合并版
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line = null;
            while ((line =  br.readLine())!=null){
                System.out.println(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package IO._07;

import java.io.*;

/**
 * @ClassName BufferInputTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 12:03
 * @Version 1.0
 **/
public class BufferInputTest {
    public static void main(String[] args) throws IOException {
        FileInputStream  fis  =new FileInputStream("C:\\Users\\long\\Desktop\\Test\\11.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\long\\Desktop\\Test\\11.txt",true);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len;
        byte[] bytes = new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\long\\Desktop\\Test\\11.txt"));
        char[] chars = new char[1024];
        while ((len=br.read(chars))!=-1){
            System.out.println(chars);
        }
        br.close();

        bis.close();
        bos.close();



    }
}

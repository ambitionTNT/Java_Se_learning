package IO._08;

import com.sun.corba.se.impl.orbutil.ObjectUtility;

import java.io.*;

/**
 * @ClassName InputStreamReader
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 17:04
 * @Version 1.0
 **/
public class OutputStream_InputStreamReaderTest01 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("C:\\Users\\long\\Desktop\\Test\\33.txt"),"UTF-8");
        out.write("Hello World,你好世界");
        out.close();

        InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\Users\\long\\Desktop\\Test\\33.txt"),"UTF-8");
        char[] chars = new char[1024];
        int len;
        while ((len=in.read(chars))!=-1){
            System.out.println(chars);
        }
        in.close();
    }
}

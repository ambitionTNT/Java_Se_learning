package IO._04;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName ExceptionTest02_JDK7
 * @Description TODO
 * @Author long
 * @Date 2022/12/26 10:58
 * @Version 1.0
 **/
public class ExceptionTest02_JDK7 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\long\\Desktop\\Test\\11.txt");){
            byte[] bytes = new byte[4];
            int len;
            while ((len=fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

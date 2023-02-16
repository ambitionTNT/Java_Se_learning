package IO._04;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName ExceptionTest03_JDK9
 * @Description TODO
 * @Author long
 * @Date 2022/12/26 11:36
 * @Version 1.0
 **/
public class ExceptionTest03_JDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\long\\Desktop\\Test\\11.txt");

//        try (fis){
//            byte[] bytes = new byte[2];
//            int len;
//            while ((len = fis.read(bytes))!=-1){
//                System.out.println(new String(bytes, 0, len));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

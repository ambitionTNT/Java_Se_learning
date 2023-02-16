package IO._06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName FileReadedrTest02
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 10:51
 * @Version 1.0
 **/
public class FileReaderTest02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\long\\Deskto" +
                "p\\Test\\N American J Aquac - 2022 - Kenter - " +
                "Thermal Tolerance and Temperature‐Dependent " +
                "Feeding Behavior of F1 Gulf and Atlantic.pdf");

        char[] chars = new char[1024];
//        int len = fileReader.read(chars);
        int len;
        while ((len = fileReader.read(chars))!=-1){
            //说明读取到了内容
            System.out.println(chars);
        }
        fileReader.close();
    }
}

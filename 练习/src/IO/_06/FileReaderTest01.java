package IO._06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName FileReaderTest01
 * @Description TODO
 * @Author long
 * @Date 2022/12/27 10:24
 * @Version 1.0
 **/
public class FileReaderTest01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\long\\Deskto" +
                "p\\Test\\N American J Aquac - 2022 - Kenter - " +
                "Thermal Tolerance and Temperature‐Dependent " +
                "Feeding Behavior of F1 Gulf and Atlantic.pdf");
        FileReader fileReader1 = new FileReader(new File("C:\\Users\\long\\Deskto" +
                "p\\Test\\N American J Aquac - 2022 - Kenter - " +
                "Thermal Tolerance and Temperature‐Dependent " +
                "Feeding Behavior of F1 Gulf and Atlantic.pdf"));
//        int ch;一次读取一个字符
//        while ((ch = fileReader.read())!=-1){
//            System.out.println((char)ch);
//        }
        //一次读取一个符数组


    }

}

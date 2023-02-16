package IO._02;

import java.io.File;
import java.util.jar.JarOutputStream;

/**
 * @ClassName FileMethodTest05
 * @Description testing the method of getName,getParentName,getAbsolutePath
 * @Author long
 * @Date 2022/12/25 16:12
 * @Version 1.0
 **/
public class FileMethodTest05 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\long\\Desktop\\Test\\text.txt");
        System.out.println(file.getName());
        System.out.println(file.getParentFile());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        File file1 = new File("long.txt");
        System.out.println(file1.getAbsolutePath());


        /**
         * listFiles必须是一个文件夹，其他会报空指针异常。
         */
        System.out.println("-------------------------------------------");
        File dir = new File("C:\\Users\\long\\Desktop");
        File[] files = dir.listFiles();
        if (files != null){
            for (File file2 :files){
                System.out.println(file2);
            }
        }


    }
}

package IO._02;

import java.io.File;

/**
 * @ClassName FileMethodTest02
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 12:54
 * @Version 1.0
 **/
public class FileMethodTest02 {
    public static void main(String[] args) {
        /**boolean	mkdir()
         Creates the directory named by this abstract pathname.
         */
        File dir = new File("C:\\Users\\long\\Desktop\\Test\\test");
        boolean flag = dir.mkdir();
        System.out.println(flag);

        File dir2 = new File("C:\\Users\\long\\Desktop\\Test\\test\\a\\b\\c");
        boolean flag2 = dir2.mkdirs();
        System.out.println(flag2);
    }
}

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    /*
File
    1、File类和四大家族没有关系，所以File类不能完成文件的读和写。
    2、File对象代表什么？
        文件和目录路径名的抽象表示形式。
        C:\Drivers 这是一个File对象
        C:\Drivers\Lan\Realtek\Readme.txt 也是File对象。
        一个File对象有可能对应的是目录，也可能是文件。
        File只是一个路径名的抽象表示形式。
    3、需要掌握File类中常用的方法
 */
    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\long\\Desktop\\file");
        // 判断是否存在！

        System.out.println(f1.exists());
        // 如果D:\file不存在，则以文件的形式创建出来
        /*if(!f1.exists()){
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/
        if (!f1.exists()){
            f1.mkdir();
        }

        File f2 = new File("C:\\Users\\long\\Desktop\\a\\b\\c\\d\\e");
        System.out.println(f2.exists());
        if (!f2.exists()){
            f2.mkdirs();
        }
        File f3 = new File("C:\\Users\\long\\Desktop\\a\\b\\c\\d\\e");
        String parentPach = f3.getParent();
        System.out.println(parentPach);
        File parentFile = f3.getAbsoluteFile();
        System.out.println(parentPach);
        File f4 = new File("copy");
        System.out.println("f4"+f4.getAbsolutePath());


    }
}

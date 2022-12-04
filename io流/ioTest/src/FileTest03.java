import java.io.File;

public class FileTest03 {
/*
File中的listFiles方法。
 */
    public static void main(String[] args) {
        // File[] listFiles()
        // 获取当前目录下所有的子文件。
        File file = new File("C:\\Users\\long\\Desktop");
        File[] files = file.listFiles();
        for (File f :files){
            System.out.println(f);
        }
    }
}

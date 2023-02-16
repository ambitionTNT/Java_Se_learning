package IO._02;

import java.io.File;

/**
 * @ClassName FileExisesizeTest01
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 16:36
 * @Version 1.0
 **/
public class FileExisesizeTest01 {
    public static void main(String[] args) {
        //获取C:\\Users\\long\\Desktop文件夹得到大小并输出

        //创建dir对象
        File dir = new File("C:\\\\Users\\\\long\\\\Desktop");
        //获取其中得到所有子文件
        File[] files = dir.listFiles();
        long size = 0;
        //遍历获取文件大小，进行累加
        if (files!=null){
            for (File file :
                    files) {
                size = size + file.length();
            }
        }

        System.out.println(size);


    }
}

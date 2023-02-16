package IO._03;

import java.io.File;

/**
 * @ClassName FileSizeTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 20:40
 * @Version 1.0
 **/
public class FileSizeTest {
    public static void main(String[] args) {
        System.out.println(getDirSize(new File("C:\\Users\\long\\Desktop")));

    }

    /**
     * 该方法可以回去一个文件夹的大小
     * @return  返回文件夹的大小
     */
    public static long getDirSize(File dir){
        long len = 0;
        //获取文件夹中的子文件夹和文件
        File[]  files = dir.listFiles();
        //遍历计算累加大小
        for (File file:files){
            //如果是文件
            if (file.isFile()){
                len += file.length();
            }else {
                //如果是文件夹
                len += getDirSize(file);
            }



        }
        return len;
        //返回结果
    }
}

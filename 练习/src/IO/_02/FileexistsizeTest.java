package IO._02;

import java.io.File;

/**
 * @ClassName FileexistsizeTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 16:47
 * @Version 1.0
 **/
public class FileexistsizeTest {
    public static void main(String[] args) {
        //刪除C:\\Users\\long\\Desktop\\Test文件夾

        //创建dir对象
        File dir = new File("C:\\Users\\long\\Desktop\\Test");
        //获取所有子文件
        File[] files = dir.listFiles();

        //先遍历子文件数组,挨个删除子文件
        if(files!=null){
            for(File file: files){
                file.delete();
            }
        }
        dir.delete();
    }

}

package IO._03;

import java.io.File;

/**
 * @ClassName FileDeleteDirTest
 * @Description TODO
 * @Author long
 * @Date 2022/12/25 20:23
 * @Version 1.0
 **/
public class FileDeleteDirTest {
    public static void main(String[] args) {
        deleteDir("C:\\Users\\long\\Desktop\\Test");
    }

    /**
     * 改方法删除一个文件夹
     * @param path:要删除的文件夹路径
     */
    public static void deleteDir(String path){
        //获取所有的子文件和文件夹  遍历删除
        File dir = new File(path);
        if (dir.exists() && dir.isDirectory()){
            File[] files = dir.listFiles();
            for (File file:files){
                //如果 是文件 直接删除
                if (file.isFile()){
                    file.delete();
                }else {
                    //递归删除文件夹
                    deleteDir(file.getAbsolutePath());
                }
            }
        }
        //删除文件夹本身
        dir.delete();

    }
}

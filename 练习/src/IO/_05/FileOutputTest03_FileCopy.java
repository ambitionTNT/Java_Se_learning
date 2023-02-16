package IO._05;

import java.io.*;

/**
 * @ClassName FileOutputTest03_FileCopy
 * @Description 文件/文件夹的赋值，就是循环的读写
 * @Author long
 * @Date 2022/12/26 17:16
 * @Version 1.0
 **/
public class FileOutputTest03_FileCopy {
    public static void main(String[] args) throws IOException {
//        File src = new File("C:\\Users\\long\\Downloads\\N American J Aquac - 2022 - Kenter - Thermal Tolerance and Temperature‐Dependent Feeding Behavior of F1 Gulf and Atlantic.pdf");
////        File destDir = new File("C:\\Users\\long\\Desktop\\Test");
////        copyFile(src,destDir);
//        File srcDir = new File("C:\\Users\\long\\Desktop\\Test");
//        File dest = new File("C:\\Users\\long\\Desktop\\Test2");
//        copyDir(srcDir, dest);
        File src = new File("C:\\Users\\long\\Desktop\\Test");
        File dest = new File("C:\\Users\\long\\Desktop\\Test2");
        copyDir2(src,dest);
    }

    /**
     * 文件复制
     * @param scr，源文件
     * @param destDir,目标文件
     */
    public static void copyFile(File scr, File destDir) throws IOException {
        //在dest下创建一个和src同名的文件
        File destFile = new File(destDir,scr.getName());
        //读取源文件，把读入的数据写入目标文件。
        FileInputStream fis = new FileInputStream(scr);
        FileOutputStream fos = new FileOutputStream(destFile);
        byte[] bytes = new byte[1024];
        int len;
    while ((len=fis.read(bytes))!=-1){
            //把读入的内容写入新文件中
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

        //释放资源
    }

    /**
     * 还要把文件夹中的内容一起复制了
     * @param srcDir 源文件夹
     * @param dest 目标文件夹
     */
    public static void copyDir(File srcDir, File dest) throws IOException {
        if (!(srcDir.exists()&& srcDir.isDirectory())){
            throw new RuntimeException("源文件夹必须存在且是一个文件夹");
        }
        if (!dest.isDirectory()){
            throw new RuntimeException("目标文件夹必须是一个文件夹");
        }
        //在目标文件夹中创建一个和源文件夹同名的文件夹
        File descDir = new File(dest,srcDir.getName());
        descDir.mkdirs();
        File[] files = srcDir.listFiles();
        if (files!=null){
            //获取源文件夹下的所有子文件夹
            //遍历数组，赋值每一个文件到目标文件夹
            for (File file:files){
                copyFile(file,descDir);
            }
        }

    }

    /**
     * 连同子文件夹一起赋值，使用递归
     * @param src
     * @param dest
     */
    public static void copyDir2(File src,File dest) throws IOException {
        if (!(src.exists()&& src.isDirectory())){
            throw new RuntimeException("源文件夹必须存在且是一个文件夹");
        }
        if (!dest.isDirectory()){
            throw new RuntimeException("目标文件夹必须是一个文件夹");
        }
        //在目标文件夹中创建一个和源文件夹同名的文件夹
        File descDir = new File(dest,src.getName());
        descDir.mkdirs();
        File[] files = src.listFiles();
        if (files!=null){
            //获取源文件夹下的所有子文件夹
            //遍历数组，赋值每一个文件到目标文件夹
            for (File file:files){
                if (file.isFile()){
                    copyFile(file,descDir);
                }else {
                    copyDir2(file,descDir);
                }

            }
        }
    }
}

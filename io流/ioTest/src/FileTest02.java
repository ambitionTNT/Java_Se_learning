import org.omg.CORBA.DATA_CONVERSION;
import sun.security.timestamp.TSRequest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\long\\Desktop\\新建文本文档.txt");
        //获取文件名
        System.out.println("文件名"+file.getName());
        // 判断是否是一个目录
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        // 获取文件最后一次修改时间
        long time = file.lastModified();
        Date date = new Date(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSSS");
        String strTime = simpleDateFormat.format(date);
        System.out.println(strTime);
        System.out.println(file.length());
    }
}

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtil {
       public static void log(String msg){
        try {
            //标准输出流指定输出方向
            //指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("log.txt",true));
            //改变输出方向
            System.setOut(out);
            //日期当前时间
            Date nowDate = new Date();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = simpleDateFormat.format(nowDate);
            System.out.println(strTime+":" +msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

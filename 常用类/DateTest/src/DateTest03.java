import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        // 这个时间是什么时间？
        // 1970-01-01 00:00:00 001
        Date date = new Date(1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String time = simpleDateFormat.format(date);
        System.out.println(time);
        // 获取昨天的此时的时间。
        Date date1 = new Date(System.currentTimeMillis()-60*60*24);
        String  time1 = simpleDateFormat.format(date1);
        System.out.println(time1);




    }
}

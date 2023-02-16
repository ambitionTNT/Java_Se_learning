import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        //创建定时器对象
        Timer timer = new Timer();
        //Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date firstTime = simpleDateFormat.parse("2022-03-17 14:52:30");
            timer.schedule(new LoginTimerTask(),firstTime,1000*10);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        //timer.schedule();
    }
}
class LoginTimerTask extends TimerTask{

    @Override
    public void run() {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            String nowDate = simpleDateFormat.format(date);
            System.out.println(nowDate);

    }
}

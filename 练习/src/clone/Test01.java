package clone;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author long
 * @Date 2022/9/9 17:21
 * @Version 1.0
 **/
public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(LocalDate.now());
        LocalDate newYearEva = LocalDate.of(1998,10,1);
        System.out.println(newYearEva.getYear());
        System.out.println(newYearEva.getMonthValue());
        System.out.println(newYearEva.getDayOfMonth());
        GregorianCalendar someDay = new GregorianCalendar(1999,10,1);
        System.out.println(someDay);
    }
}

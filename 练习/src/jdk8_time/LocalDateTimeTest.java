package jdk8_time;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

/**
 * @ClassName LocalDateTimeTest
 * @Description TODO
 * @Author long
 * @Date 2023/1/10 18:09
 * @Version 1.0
 **/
public class LocalDateTimeTest {
    /**
     * 1.LocalDate LocalTime LocalDateTime
     */
    @Test
    public void test01(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt2 = LocalDateTime.of(2023,01,10,13,22,22);
        System.out.println(ldt2);

        LocalDateTime ldt3 = ldt.plusYears(2);
        System.out.println(ldt3);

        LocalDateTime ldt4 = ldt.minusDays(300);
        System.out.println(ldt4);
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getYear());

    }
    /**
     * Instance: 时间戳（以Unix元年 ：1970.1.1 00:00:00到某个时间之间的毫秒数）
     */

    @Test
    public void test02(){
        Instant ins1 = Instant.now();//默认获取的是以UTC时区为基础的。
        System.out.println(ins1);
        OffsetDateTime odt = ins1.atOffset(ZoneOffset.ofHours(8));
        System.out.println(odt);
        //转换成毫秒时间
        System.out.println(ins1.toEpochMilli());
        Instant ins2 = Instant.ofEpochSecond(60);
        System.out.println(ins2);
    }

    /**
     * Duration:计算两个“时间”之间的间隔
     * Period: 计算两个“日期”之间得到间隔
     */

    @Test
    public void test03() throws InterruptedException {
        Instant ins1 = Instant.now();

        Thread.sleep(2000);
        Instant ins2 = Instant.now();
        Duration duration = Duration.between(ins1,ins2);
        System.out.println(duration);
        System.out.println(duration.toMillis());

        LocalTime lt1 = LocalTime.now();
        Thread.sleep(2000);

        LocalTime lt2 = LocalTime.now();
        Duration duration1 = Duration.between(lt1, lt2);
        System.out.println(duration1.toMillis());
    }


    /**
     * Period: 计算两个“日期”之间得到间隔
     */
    @Test
    public void test04(){
        LocalDate ldt1 = LocalDate.of(2015,1,1);
        LocalDate ldt2 = LocalDate.now();
        Period period = Period.between(ldt1, ldt2);
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

    }

    /**
     * TemporalAdjuster:时间校正器
     */
    @Test
    public void test05(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //指定到某一天
        LocalDateTime ldt2 = ldt.withDayOfMonth(15);
        System.out.println(ldt2);

        LocalDateTime ldt3 = ldt.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(ldt3);
        System.out.println(ldt.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));

        /**
         * 自定义：下一个工作日
         */
        System.out.println(ldt.with((l)->{
            LocalDateTime ldt4 = (LocalDateTime)l;
            DayOfWeek dow = ldt4.getDayOfWeek();
            if (dow.equals(DayOfWeek.FRIDAY)){
                return ldt4.plusDays(3);
            }else if (dow.equals(DayOfWeek.SATURDAY)){
                return ldt4.plusDays(2);
            }else{
                return ldt4.plusDays(1);
            }
        }));
    }

    /**
     * DateTimeFormatter:格式化时间/日期
     */
    @Test
    public void test06(){
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime ldt = LocalDateTime.now();
        String strDate = ldt.format(dtf);
        System.out.println(strDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(dtf2.format(ldt));

        String strDate2 = dtf2.format(ldt);
        LocalDateTime newDate = ldt.parse(strDate2,dtf2);
        System.out.println(newDate);

    }


    /**
     * 处理时期
     */
    @Test
    public void test07(){
        /**
         * 查看支持对的时区
         */
        Set<String> set = ZoneId.getAvailableZoneIds();
        set.forEach(System.out::println);
    }

    @Test
    public void test08(){
        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Europe/Luxembourg"));
        System.out.println(ldt);

        LocalDateTime ldt2 = LocalDateTime.now();
        /**
         * 構建带时区的时间和日期
         */
        ZonedDateTime zdt = ldt2.atZone(ZoneId.of("Europe/Luxembourg"));
        System.out.println(zdt);
    }


}

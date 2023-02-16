package jdk8_time;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @ClassName DataFormatThreadLocal
 * @Description TODO
 * @Author long
 * @Date 2023/1/10 17:35
 * @Version 1.0
 **/
public class DataFormatThreadLocal {
    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>(){
        protected DateFormat initialValue(){
            return new SimpleDateFormat("yyyyMMdd");
        }
    };

    public static Date convert(String source) throws ParseException {
        return df.get().parse(source);
    }

    @Test
    public void test01() throws ExecutionException, InterruptedException {


        Callable<Date> task = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                //使用自编的多线程安全的convert
                return DataFormatThreadLocal.convert("20230110");
            }
        };
        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<Future<Date>> results = new ArrayList<>();

        for (int i =0;i < 10; i++){
            results.add(pool.submit(task));
        }
        for (Future<Date> future: results){
            System.out.println(future.get());
        }
    }

    @Test
    public void test02() throws ExecutionException, InterruptedException {
        /**
         * jdk8的时间 多线程同步问题
         */

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        Callable<LocalDate> task = new Callable<LocalDate>() {
            @Override
            public LocalDate call() throws Exception {
                //使用自编的多线程安全的convert
                return LocalDate.parse("20230110",dtf);
            }
        };
        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<Future<LocalDate>> results = new ArrayList<>();

        for (int i =0;i < 10; i++){
            results.add(pool.submit(task));
        }
        for (Future<LocalDate> future: results){
            System.out.println(future.get());
        }

    }
}

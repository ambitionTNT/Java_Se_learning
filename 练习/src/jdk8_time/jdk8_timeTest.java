package jdk8_time;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @ClassName jdk8_time
 * @Description TODO
 * @Author long
 * @Date 2023/1/10 17:13
 * @Version 1.0
 **/
public class jdk8_timeTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Callable<Date> task = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                return sdf.parse("20230110");
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
}

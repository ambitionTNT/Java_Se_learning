package StreamAPI.forkjoin;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * @ClassName TestForkJoin
 * @Description TODO
 * @Author long
 * @Date 2023/1/9 17:47
 * @Version 1.0
 **/
public class TestForkJoin {
    @Test
    public void test01(){

        Instant start = Instant.now();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinCalculate(0, 1000000000000L);
        Long sum= pool.invoke(task);
        System.out.println(sum);
        Instant end = Instant.now();

        System.out.println(Duration.between(start,end).toMillis());
    }

    @Test
    public void test02(){
        Long sum = 0L;
        Instant start = Instant.now();
        for (long i = 0; i < 1000000000000L;i++){
            sum += i;
        }
        System.out.println(sum);
        Instant end = Instant.now();
        System.out.println(Duration.between(start,end).toMillis());

    }
    @Test
    public void test03(){
        Instant start = Instant.now();
        LongStream.rangeClosed(0, 100000000000L)
                .parallel()
                .reduce(0,Long::sum);
        Instant end = Instant.now();
        System.out.println(Duration.between(start,end).toMillis());

    }
}

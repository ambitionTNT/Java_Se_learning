package StreamAPI;


import lambda.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @ClassName TestStreamAPI1
 * @Description
 * 1、创建 Stream
 * 2、中间操作
 * 3、终止操作（终端操作）
 * @Author long
 * @Date 2023/1/1 21:05
 * @Version 1.0
 **/
public class TestStreamAPI1 {
    @Test
    public void test01(){
        /**
         * 1、可以通过Collection系列集合提供stream()或parallelStream
         */
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        /**
         * 2、通过Arrays中的静态方法stream()获取数组流
         */
        Employee[] emps = new Employee[10];
        Stream<Employee> stream2 = Arrays.stream(emps);

        /**
         * 3、通过Stream中的静态方法of()方法
         */
        Stream<String> stream3 = Stream.of("aa","bb","c");

        /**
         * 4、创建无限流
         * 迭代
         */

        Stream<Integer> stream4= Stream.iterate(0, (x)->x+2);
//        stream4.forEach(System.out::println);
        stream4.limit(10).forEach(System.out::println);

        /**
         * 生成
         */

        Stream.generate(()->(Math.random()))
                .forEach(System.out::println);






    }


}

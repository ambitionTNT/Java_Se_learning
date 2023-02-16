package StreamAPI.exer;

import lambda.Employee;
import lambda.Status;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName TestStreamAPI04
 * @Description TODO
 * @Author long
 * @Date 2023/1/5 21:55
 * @Version 1.0
 **/
public class TestStreamAPI04 {
    List<Employee> employees = Arrays.asList(
            new Employee(101,"张三",18,9999.11, Status.FREE),
            new Employee(102,"王二",28,8976.22,Status.BUSY),
            new Employee(103,"李四",19,9897.22,Status.FREE),
            new Employee(104,"赵六",58,198976.34,Status.BUSY),
            new Employee(104,"田其",36,123123.43,Status.BUSY),
            new Employee(104,"田其",36,123123.43,Status.BUSY),
            new Employee(104,"田其",36,123123.312,Status.VOCATION)
    );
    /**
     * 给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？
     * 给定[1,2,3,4,5] 返回[1,4,9,16,25]
     */
    @Test
    public void test01(){
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5};
        //获取一个数组的流
        Arrays.stream(nums)
                .map((x)->x*x)
                .forEach(System.out::println);
    }


    /**
     * 怎样使用map和reduce方法数一数流中有多少Employee呢？
     */
    @Test
    public void test02(){
        Optional<Integer> op1 = employees.stream()
                .map((e)->1)
                .reduce(Integer::sum);
        System.out.println(op1.get());

    }

    /**
     * 
     */
}

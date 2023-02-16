package StreamAPI;

import lambda.Employee;
import lambda.Status;
import org.junit.Test;

import javax.xml.bind.Element;
import java.util.*;
import java.util.function.DoubleConsumer;
import java.util.stream.Collectors;

/**
 * @ClassName TestStreamAPI03
 * @Description 终止操作
 * @Author long
 * @Date 2023/1/5 15:24
 * @Version 1.0
 **/
public class TestStreamAPI03 {
    /**
     * 查找与匹配
     *
     * 		    allMatch  检查是否匹配所有元素
     * 		    anyMatch  检查是否没有匹配所有元素
     * 		    findFirst  返回第一个元素
     * 		    findAny   返回当前流中的任意元素
     * 		    count 返回流中元素的总个数
     * 		    max  返回流中最大值
     * 		    min  返回流中最小值
     */
    List<Employee> employees = Arrays.asList(
            new Employee(101,"张三",18,9999.11, Status.FREE),
            new Employee(102,"王二",28,8976.22,Status.BUSY),
            new Employee(103,"李四",19,9897.22,Status.FREE),
            new Employee(104,"赵六",58,198976.34,Status.BUSY),
            new Employee(104,"田其",36,123123.43,Status.BUSY),
            new Employee(104,"田其",36,123123.43,Status.BUSY),
            new Employee(104,"田其",36,123123.312,Status.VOCATION)
    );


    @Test
    public void test01(){
        boolean  b1 = employees.stream()
                .allMatch((e)->e.getStatus().equals(Status.BUSY));
        System.out.println(b1);

        boolean b2 = employees.stream()
                .anyMatch((e)->e.getStatus().equals(Status.BUSY));
        System.out.println(b2);

        boolean b3 = employees.stream()
                .noneMatch((e)->e.getStatus().equals(Status.BUSY));
        System.out.println(b3);
        /**
         * 封装到一个容器Optional中，可以避免返回的内容为空导致空指针异常
         */
        Optional<Employee> op = employees.stream()
                .sorted((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()))
                .findFirst();

        System.out.println(op.get());

        /**
         * 需求：查找空闲状态的employee加到新的团队中
         * parallelStream并行流，多线程
         */

        Optional op2 = employees.parallelStream()
                .filter((e)->e.getStatus().equals(Status.FREE))
                .findAny();
        System.out.println(op2.get());




    }

    @Test
    public void test02(){
        Long count = employees.stream()
                .count();
        System.out.println(count);
        Optional<Employee> op3 = employees.stream()
                .max((e1, e2)-> Double.compare(e1.getSalary(),e2.getSalary()));
        System.out.println(op3.get());

        Optional<Double> op4 = employees.stream()
                .map(Employee::getSalary)
                .min(Double::compare);
        System.out.println(op4.get());

    }

    /**
     * 归约
     * 			reduce(T identity, BinaryOperator)/reduce(BinaryOperator)
     * 			可以将流中的元素反复结合起来，得到一个值
     */
    @Test
    public void test03(){
        List<Integer> list =  Arrays.asList(1,2,3,4,5,5,6,7,8,9);

        Integer sum = list.stream()
                .reduce(0,(x, y)->x + y);
        System.out.println(sum);

        Optional<Double> op = employees.stream()
                .map(Employee::getSalary)
                .reduce(Double::sum);
        System.out.println(op.get());



    }

    /**
     *
     收集
     collect 将流转换成其他形式
     */

    @Test
    public void test04(){
        /**
         * 收集到list中
         */
        List<String> list = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        /**
         * 收集到Set中
         */

        Set<String> set = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());
        System.out.println(set);

        /**
         * 收集到其他中
         */

        HashSet<String> hashSet = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(hashSet);

        /**
         * 总数
         */
        Long count = employees.stream()
                .collect(Collectors.counting());
        System.out.println(count);
        System.out.println("___________________________________________________________");
        /**
         * 平均值
         */
        Double avg = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);

        /**
         * 总和
         */
        Double sum = employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(sum);

        /**
         * 最大值
         */
        Optional<Employee> max = employees.stream()
                .collect(Collectors.maxBy((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())));
        System.out.println(max.get());

        /**
         * 最小值
         */

        Optional<Double> min = employees.stream()
                .map(Employee::getSalary)
                .collect(Collectors.minBy(Double::compare));
        System.out.println(min);

        System.out.println("_____________________________________________________");
        /**
         * 分组
         */

        Map<Status,List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getStatus));
        System.out.println(map);
        /**
         * 多级分组
         */
        Map<Status,Map<String, List<Employee>>> mapMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getStatus,Collectors.groupingBy((e)->{
                    if (e.getAge()<=35){
                        return "青年";
                    } else if (e.getAge()<=55){
                        return "中年";
                    }else {
                        return "老年";
                    }
                })));
        System.out.println(mapMap);

        /**
         * 分区
         */

        Map<Boolean, List<Employee>> booleanListMap = employees.stream()
                .collect(Collectors.partitioningBy((e)->e.getSalary()>10000));
        System.out.println(booleanListMap);

        /**
         *  其他:全部
         */

        DoubleSummaryStatistics dss = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(dss.getSum());

        /**
         * 连接
         */

        String str = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining());
        System.out.println(str);

    }



}

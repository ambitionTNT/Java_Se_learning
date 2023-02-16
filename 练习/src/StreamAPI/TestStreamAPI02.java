package StreamAPI;

/**
 * @ClassName TestStreamAPI02
 * @Description 中间操作
 * @Author long
 * @Date 2023/1/3 17:05
 * @Version 1.0
 **/

import lambda.Employee;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * filter--接收Lambda,从流中排出某些元素。
 * 		limit--截断流，使其元素不超过给定得到数量。
 * 		skip(n)--跳过元素，返回一个扔掉了前n个元素对的流。若流中元素不足n个，则返回一个空流。
 * 			与limit(n)互补
 * 		distinct--筛选，通过流生成的hashCoded()和equals()去除重复元素。
 */
public class TestStreamAPI02 {
    List<Employee> employees = Arrays.asList(
            new Employee(101,"张三",18,9999.11),
            new Employee(102,"王二",28,8976.22),
            new Employee(103,"李四",19,9897.22),
            new Employee(104,"赵六",58,198976.34),
            new Employee(104,"田其",36,123123.43),
            new Employee(104,"田其",36,123123.43),
            new Employee(104,"田其",36,123123.312)
    );

    /**
     * 内部迭代：迭代操作 由Stream API完成
     * test filter
     */
    @Test
    public void test01(){
        /**
         * 1、创建流
         */
        Stream<Employee> stream = employees.stream()
                                    .filter((e)->e.getAge()>35);
        /**
         * 终止操作
         */
        stream.forEach(System.out::println);

    }

    /**
     * 外部迭代:
     */
    @Test
    public void test02(){
        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()){
            System.out.println(it.next());

        }
    }

    /**
     * testing limit
     * 短路：一旦发现满足limit的条件就不需要在继续迭代，提高了效率
     */
    @Test
    public void test03(){
        employees.stream()
                .filter((e)->{
                    System.out.println("短路");
                    return e.getSalary()>5000;
                })
                .limit(2)
                .forEach(System.out::println);

    }

    /**
     * testing skip扔掉前几个,取后面的
     *
     */
    @Test
    public void test04(){
        employees.stream()
                .filter((e)->e.getSalary()>5000)
                .skip(2)
                .forEach(System.out::println);

    }


    /**
     * testing distinct筛选
     */
    @Test
    public void test05(){
        employees.stream()
                .filter((e)->e.getSalary()>5000)
                .distinct()
                .forEach(System.out::println);
    }
    /**
     * 映射
     * 		    map--接收lambda，将元素转换成其他形式或提取信息。接收一个函数作为参数，该函数会被应用到么个元素上
     * 		    flatMap--接受一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连成一个流。
     *
     */

    @Test
    public void test06(){
        List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");
        list.stream()
                .map((str)->str.toUpperCase())
                .forEach(System.out::println);
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
        System.out.println("_______________________________________________________________");
        /**
         * 调用filterCharacter时返回的是流，而map返回的也是流，所以称为了流中流
         * 这时，变量接受流中流时，就需声明为Stream<Stream<Character>> streamStream
         * 遍历时，也需要嵌套着进行
         */
        Stream<Stream<Character>> streamStream = list.stream()
                .map(TestStreamAPI02::filterCharacter);

        streamStream.forEach((sm)->{
            sm.forEach(System.out::println);
        });
        System.out.println("____________________________________________________________");
        /**
         * 解决上述，流中流的方法flatMap
         */
        Stream<Character> stream = list.stream()
                .flatMap(TestStreamAPI02::filterCharacter);
        stream.forEach(System.out::println);
    }

    /**
     * 将字符串转换成字符数组
     * @param str
     * @return
     */
    public static Stream<Character> filterCharacter(String str){
        List<Character> list = new ArrayList<>();
        for (Character ch : str.toCharArray()){
            list.add(ch);
        }
        return list.stream();
    }
    @Test
    public void test07(){
        List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");
        List list1 = new ArrayList();
        list1.add(11);
        list1.add(22);
        list1.add(list);
        list1.addAll(list);
        System.out.println(list1);
    }


    /**
     * 排序
     *  sorted() 自然排序,按照原始的comparable进行排序
     * 		    sorted(Comparator com)  定制排序
     *
     * 		    allMatch  检查是否匹配所有元素
     * 		    anyMatch  检查是否没有匹配所有元素
     * 		    findFirst  返回第一个元素
     * 		    findAny   返回当前流中的任意元素
     * 		    count 返回流中元素的总个数
     * 		    max  返回流中最大值
     * 		    min  返回流中最小值
     */



   @Test
   public void test08(){
       List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");
       list.stream()
               .sorted()
               .forEach(System.out::println);
       System.out.println("_________________________________________");
       employees.stream()
               .sorted((e1,e2) ->{
                   if (e1.getAge() ==  e2.getAge()){
                       return e1.getName().compareTo(e2.getName());
                   }else {
                       return e1.getAge()-e2.getAge();
                   }
               })
               .forEach(System.out::println);
   }



}



package lambda;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @ClassName MethodRefTest
 * @Description TODO
 * @Author long
 * @Date 2022/9/14 21:24
 * @Version 1.0
 **/
public class MethodRefTest {

    @Test
    public void test06(){
        Function<Integer,String[]> function = (x)-> new String[x];
        String[] strs = function.apply(10);
        System.out.println(strs.length);
    }

    @Test
    public void test04(){
        Supplier<Employee> supplier = () -> new Employee();
        //构造器引用
        Supplier<Employee> supplier1 = Employee::new;
        Employee employee = supplier1.get();
        System.out.println(employee);


    }

    @Test
    public void test05(){
        Function<Integer,Employee> function = (x) -> new Employee(x);
        Function< Integer,Employee> function1  = Employee::new;
        Employee employee = function1.apply(1002);
        System.out.println(employee);
    }




    @Test//类：实例方法
    public void test03(){
        BiPredicate<String ,String> bp = (x,y) ->x.equals(y);
        BiPredicate<String,String > bp2 = String::equals;
        System.out.println(bp2.test("hello","hello"));

    }


    @Test//静态方法名
    public void test02(){
        Comparator<Integer> comparator = (x,y)->Integer.compare(x,y);

        Comparator<Integer> comparator1 =Integer::compare;

        System.out.println(comparator1.compare(1000,2020));


}
    @Test//::实例方法名
    public void test01(){
        Employee emp = new Employee();
        Supplier<String> supplier = () -> emp.getName();
        String string = supplier.get();
        System.out.println(string);

        //方法引用
        Supplier<Integer> supplier1 = emp::getAge;
        Integer numAge = supplier1.get();
        System.out.println(numAge);

    }
}

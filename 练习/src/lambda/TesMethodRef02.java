package lambda;


import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.PrintStream;
import java.util.Comparator;

import java.util.function.*;

/**
 * @ClassName TesMethod02
 * @Description 方法引用：若Lambda体中的内容有方法已经实现了，我们可以使用“方法引用”
 * 其实是Lambda表达式的另一种表现形式
 * 三种格式：
 *  对象::实例方法名
 *  类::静态方法名
 *  类::实例方法名
 *      Lambda体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的函数列表和返回值类型保持一致！
 *      若Lambda参数列表中的第一参数是实例方法的调用者，而第二参数是实例方法的参数时，可以使用ClassName::method
 *二：构造器引用
 *  格式：
 *      ClassName::new
 *     注意：
 *      需要调用的构造器参数列表要与函数式接口中抽象方法的参数列表保持一致。
 *
 *三 ：数组引用
 *
 *      Type::new
 * @Author long
 * @Date 2022/12/31 16:33
 * @Version 1.0
 **/


public class TesMethodRef02 {
    /**
     * 对象::实例方法名
     */
    @Test
    public void test01(){
        Consumer<String> con = (x)-> System.out.println(x);
        PrintStream ps = System.out;
        Consumer<String > con1 = ps::println;

        Consumer<String >con2 = System.out::println;
        con2.accept("abce");

    }
    @Test
    public void test02(){
        Employee emp = new Employee();
        Supplier<String>  sup = ()->emp.getName();
        String str = sup.get();
        System.out.println(str);

        /**
         * 方法引用
         */

        Supplier<Integer> sup2 = emp::getAge;
        System.out.println(sup2.get());
    }
/*-------------------------------------------------------------------------------------------*/
    /**
     * 类::静态方法名
     */


    @Test
    public void test03(){
        Comparator<Integer> com =(x,y)->Integer.compare(x,y);
        Comparator<Integer> com1 = Integer::compare;

        System.out.println(com1.compare(20,10));
    }
    /*-------------------------------------------------------------------------------------------*/

    /**
     * 类::实例方法名
     */
    @Test
    public void test04(){
        BiPredicate<String, String> bp =(x, y)->x.equals(y);
        BiPredicate<String, String> bp2 = String::equals;
    }
    /*-------------------------------------------------------------------------------------------*/
    /**
     * 构造器引用
     *  无参构造器
     */
    @Test
    public void test05(){
        Supplier<Employee> sup = () -> new Employee();
        Supplier<Employee> sup1 = Employee::new;
        System.out.println(sup1.get());

    }

    /**
     * 一个参数的构造器
     */
    @Test
    public void test06(){
        Function<Integer,Employee> fun = (x) ->new Employee(x);
        Function<Integer,Employee> fun2 = Employee::new;
        System.out.println(fun2.apply(101));
        BiFunction<Integer,String,Employee> bf = Employee::new;
        System.out.println(bf.apply(1001,"jack"));

    }
    /*-------------------------------------------------------------------------------------------*/
    /**
     * 数组引用
     */
    @Test
    public void test07(){
        Function<Integer,String[]> fun = (x)->new String[x];
        String[] strs = fun.apply(10);
        System.out.println(strs.length);
        Function<Integer, String[]> fun2 = String[]::new;
        String[] strings = fun2.apply(20);
        System.out.println(strings.length);
    }
}

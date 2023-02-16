package lambda;

/**
 * @ClassName TestLambda04
 * @Description TODO
 * @Author long
 * @Date 2022/12/29 22:51
 * @Version 1.0
 **/

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 	    四个内置的接口：
 *     1、消费型：
 *         Consumer<T> :
 *             void accept(T t);
 *     2、供给型：
 *         Supplier<T> :
 *             T get();
 *
 *     3、函数向
 *         Function<T,R>：
 *             R apply(T t);
 *     4、断言型：
 *         Predicate<T> :
 *             boolean test(T t
 */
public class TestLambda04 {
    /**
     * Consumer<T> 消费型接口：
     */
    @Test
    public void test01(){
        happy(1000, (m)-> System.out.println("李哥喜欢大保健，每次消费："+m));
    }


    public void happy(double money, Consumer<Double> con){
        con.accept(money);
    }


    /**
     * 供给型接口:supplier
     */

    @Test
    public void test02(){
        List<Integer> numList = getNumList(10,() -> (int)(Math.random() *100));
        System.out.println(numList);
    }
    //需求：产生指定个数的整数，并放入集合中
    public List<Integer> getNumList(int num, Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< num; i++){
            list.add(supplier.get());
        }
        return list;
    }


    /**
     * 函数型接口，Function<T,R>
     */
    @Test
    public void test03(){
        String str = "\t\t\t\t\t\tHello World";
        System.out.println(strHandler(str,(s)->s.trim()));
        System.out.println(strHandler(str,(s)->s.toUpperCase()));
        System.out.println(strHandler(str,(s)->s.substring(2,10)));

    }

    /**
     * 需求：处理字符串
     */
    public String strHandler(String string, Function<String,String>fun ){
        return fun.apply(string);
    }


    /**
     * 断言型接口：Predicate<T>
     *     需求：将满足条件的字符串添加到集合中返回
     */
    public List<String> filterString(List<String> list, Predicate<String> predicate){
        List<String> stringList = new ArrayList<>();
        for (String string: list){
            if (predicate.test(string)) {

                stringList.add(string);
            }
        }
        return stringList;
    }

    @Test
    public void test04(){
        List<String >  list = Arrays.asList("hello","张传龙","孙悟空","上下其所","World","你好","潘苗");
        List<String >stringList = filterString(list,(s)->s.length()>=3);
        System.out.println(stringList);

    }
}

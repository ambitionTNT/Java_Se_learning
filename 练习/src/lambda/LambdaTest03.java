package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @ClassName LambdaTest03
 * @Description TODO
 * @Author long
 * @Date 2022/9/14 19:35
 * @Version 1.0
 **/

/*
    四个内置的接口：
    1、消费型：
        Consumer<T> :
            void accept(T t);
    2、供给型：
        Supplier<T> :
            T get();

    3、函数向
        Function<T,R>：
            R apply(T t);
    4、断言型：
        Predicate<T> :
            boolean test(T t);

*/
public class LambdaTest03 {
    @Test
    public void test01(){
        List<Integer> numList = getNumList(10, ()->(int)(Math.random()*100) );
        for (Integer num:numList){
            System.out.println(num);
        }
    }
    public List<Integer> getNumList(int num, Supplier<Integer> supplier){

        List<Integer> list = new ArrayList<>();

        for (int i = 0;i<num;i++){
            Integer n = supplier.get();
            list.add(n);
        }

        return list;
    }

    @Test
    public void test03(){
        String newStr = strHandler("\t\t\t\t Hello World",(str)->str.trim());
        System.out.println(newStr);
    }
        public String strHandler(String str , Function<String ,String> fun){
            return fun.apply(str);
        }



    @Test
    public void test04(){

        happy(998,(m)-> System.out.println("吃大餐"+m));
    }

    public void happy(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }

    @Test
    public void test05(){
        List<String> stringList = Arrays.asList("java","c++","Bash","Go","javastript");
        List<String> newStr = filterStr(stringList,(str)->str.length()>2);
        for (String str:newStr){
            System.out.println(str);
        }
    }

    public List<String > filterStr(List<String > list, Predicate<String> predicate){
        List<String> stringList = new ArrayList<>();
        for (String string :list){
            if (predicate.test(string)){
                stringList.add(string);
            }
        }

        return stringList;
    }
}



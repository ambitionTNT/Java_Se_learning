package lambda;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;

/**
 * @ClassName TestLambda2
 * @Description TODO
 * @Author long
 * @Date 2022/12/29 19:34
 * @Version 1.0
 **/
public class TestLambda2 {
    @Test
    public void test01(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
        r.run();
        System.out.println("_________________________________");
        Runnable r1 = () -> System.out.println("Hello Lambda");
        r1.run();
    }
    @Test
    public void test02(){
        Consumer<String> con = x -> System.out.println(x);
        con.accept("Hello World");
    }

    @Test
    public void test03(){
        Comparator<Integer> com = (x, y)->{
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
    }

    /**
     * 类型推断出
     */
    public void test04(){
        Comparator<Integer> com = (x, y)->Integer.compare(x, y);
  }
    public void test05(){
        String[] strs = {"aaa","bbb","ccc"};
        List<String> list = new ArrayList<>();
        show(new HashMap<>());
    }

    private void show(Map<String, Integer>map) {

    }

    /**
     * 需求：一个数进行运算
     */
    @Test
    public void test06(){
        Integer  num =  operation(100, x-> x*x);
        System.out.println(num);
        System.out.println(operation(200,x-> x+200));
    }
    public Integer operation(Integer num, MyFunc func){
        return func.getValue(num);

    }

}

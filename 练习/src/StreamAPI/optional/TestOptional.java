package StreamAPI.optional;

import lambda.Employee;
import lambda.Status;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Optional;

/**
 * @ClassName TestOptional
 * @Description TODO
 * @Author long
 * @Date 2023/1/9 18:06
 * @Version 1.0
 **/
public class TestOptional {

    /**
     * 			Optional.of(T t) : 创建一个 Optional 实例
     * 			Optional.empty() : 创建一个空的 Optional 实例
     * 			Optional.ofNullable(T t):若 t 不为 null,创建 Optional 实例,否则创建空实例
     * 			isPresent() : 判断是否包含值
     * 			orElse(T t) : 如果调用对象包含值，返回该值，否则返回t
     * 			orElseGet(Supplier s) :如果调用对象包含值，返回该值，否则返回 s 获取的值
     * 			map(Function f): 如果有值对其处理，并返回处理后的Optional，否则返回 Optional.empty()
     * 			flatMap(Function mapper):与 map 类似，要求返回值必须是Optional
     */

    @Test
    public void test01(){
        Optional<Employee> op = Optional.of(new Employee());
        if (op.isPresent()){
            System.out.println(op.get());

        }
    }

    @Test
    public void test02(){
        Optional<Employee> op = Optional.empty();
        System.out.println(op.get());
    }

    @Test
    public void test03(){
        Optional<Employee> op = Optional.ofNullable(null);
//        if (op.isPresent()){
//            System.out.println(op.get());
//        }
//        System.out.println(op.orElse(new Employee()));
        System.out.println(op.orElseGet(() -> new Employee()));


    }

    @Test
    public void test04(){
        Optional<Employee> op = Optional.ofNullable(new Employee(1002,"Jack",18,8927.23, Status.BUSY));
        System.out.println(op.map((e)->e.getSalary()).get());
        System.out.println(op.flatMap((e)->Optional.of(e.getName())).get());

    }

    /**
     * 例题
     */
    @Test
    public void test05(){
        Man man = new Man();
        String n = getGodnessName(man);
        System.out.println(n);
    }

    /**
     * 需求：获取一个男人心中女神的名字
     */
    public String getGodnessName(Man man){
        if (man!=null){
            Godness g = man.getGodness();
            if (g!=null){
                return g.getName();
            }
        }
        return "苍老师";
    }
    public String getGodnessName2(Optional<NewMan> man){
        return man.orElse(new NewMan())
                .getGodness()
                .orElse(new Godness("苍老师"))
                .getName();

    }

}


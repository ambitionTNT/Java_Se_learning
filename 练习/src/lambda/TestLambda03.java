package lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName TestLambda03
 * @Description TODO
 * @Author long
 * @Date 2022/12/29 21:49
 * @Version 1.0
 **/
public class TestLambda03 {
    List<Employee> employees = Arrays.asList(
            new Employee(101,"张三",18,9999.11),
            new Employee(102,"王二",28,8976.22),
            new Employee(103,"李四",19,9897.22),
            new Employee(104,"赵六",58,198976.34),
            new Employee(104,"田其",36,123123.43),
            new Employee(104,"田其",36,123123.43),
            new Employee(104,"田其",36,123123.312)
    );
    @Test
    public void test01(){
        Collections.sort(employees,(e1,e2)->{
            if (e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else {
                return Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for (Employee employee :employees){
            System.out.println(employee);
        }
    }

    /**
     * 需求:用于处理字符串
     */
    public String strHandler(String str, MyFunction function){
        return function.getValue(str);
    }

    @Test
    public void test02(){
        String string = strHandler("\t\t\t\t\thello world", (str)->str.trim());
        System.out.println(string);
        string = strHandler("\t\t\t\t\thello world", (str)->str.toUpperCase());
        System.out.println(string);
    }

    /**
     * 需求:对于两个Long类型数据进行处理
     *
     */
    public void op(Long l1, Long l2, MyFunction2<Long,Long> mf){
        System.out.println(mf.getValue(l1, l2));


    }
    @Test
    public void test03(){
        op(100L,200L, (x,y)->x+y);
        op(100L,200L,(x, y)->x*y);
    }

}

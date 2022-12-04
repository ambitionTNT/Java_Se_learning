package lambda;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * @ClassName LambdaTest01
 * @Description TODO
 * @Author long
 * @Date 2022/9/13 17:41
 * @Version 1.0
 **/
public class LambdaTest01 {

    @Test
    public void test1(){
        List<Employee> employees = Arrays.asList(new Employee(101,"张三",18,9999.11),
        new Employee(102,"王二",28,8976),
        new Employee(103,"李四",19,9897),
        new Employee(104,"赵六",58,198976),
        new Employee(104,"田其",36,123123)
    );



        Collections.sort(employees,(e2,e1)->{
            if (e2.getAge() == e1.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else{
                return Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for (Employee e :employees){
            System.out.println(e);
        }

    }
    /*
    功能性函数
     */
    @Test
    public void test02(){
        String trimStr = strHandler("hello world ",(string)-> string.trim());
        System.out.println(trimStr);
        String upperCaseStr = strHandler("hello world", (string )->string.toUpperCase());
        System.out.println(upperCaseStr);
    }

    public String strHandler(String str,MyFunction my){
        return my.getValue(str);
    }

    @Test
    public void test03(){
        option(1000L,2000L,(x,y)->x * y );

    }



    public void option(Long l1,Long l2,MyFunction2<Long,Long> my2){
        System.out.println(my2.getValue(l1,l2));
    }
}



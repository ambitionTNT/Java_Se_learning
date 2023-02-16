package lambda;

import com.sun.javafx.image.PixelUtils;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.*;

/**
 * @ClassName TestLambda
 * @Description TODO
 * @Author long
 * @Date 2022/12/29 15:43
 * @Version 1.0
 **/
public class TestLambda {
    List<Employee> employees = Arrays.asList(
            new Employee(101,"张三",18,9999.11),
            new Employee(102,"王二",28,8976.22),
            new Employee(103,"李四",19,9897.22),
            new Employee(104,"赵六",58,198976.34),
            new Employee(104,"田其",36,123123.43),
            new Employee(104,"田其",36,123123.43),
            new Employee(104,"田其",36,123123.312)
    );
    //原来的匿名内部类
    @Test
    public void test01(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> ts = new TreeSet<>(com);
    }

    //Lambda表达式
    public void test02(){
        Comparator<Integer> com =  (x, y)->Integer.compare(x, y);
        TreeSet<Integer> ts = new TreeSet<>(com);

    }
    /**
     *     优化方式一:策略设计模式
     */

    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> mp){
        List<Employee>emps= new ArrayList<>();
        for (Employee  employee:list){
            if (mp.test(employee)){
                emps.add(employee);
            }
        }
        return emps;
    }

    @Test
    public void test03(){
        List<Employee> employees = Arrays.asList(
                new Employee(101,"张三",18,9999.11),
                new Employee(102,"王二",28,8976.22),
                new Employee(103,"李四",19,9897.22),
                new Employee(104,"赵六",58,198976.34),
                new Employee(104,"田其",36,123123.43),
                new Employee(104,"田其",36,123123.43),
                new Employee(104,"田其",36,123123.312)
        );
        List<Employee> list = filterEmployee(employees, new FilterEmployeeByAge());
        for (Employee employee:list){
            System.out.println(employee);
        }

        System.out.println("————————————————————————————————————————————————————————————————————————————");
        List<Employee>  list1 = filterEmployee(employees,new FilerEmployeeBySalary());
        for (Employee employee:list1){
            System.out.println(employee);
        }
    }


    /**
     * 优化方式二:匿名内部类
     */
    @Test
    public void test05(){
        List<Employee> list = filterEmployee(employees, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary()<= 10000;
            }
        });
        for (Employee employee:list){
            System.out.println(employee);
        }
    }

    /**
     * 优化方式三:lambda表达式
     */
    @Test
    public void test06(){
        List<Employee> list = filterEmployee(employees, (e)->e.getSalary()<=10000);
        list.forEach(System.out::println);
    }

    /**
     * 优化方式四:Stream API
     */
    @Test
    public void test07(){
        employees.stream()
                .filter((e)->e.getSalary()<=10000)
                .forEach(System.out::println);
    }
}

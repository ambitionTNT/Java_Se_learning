package lambda;

/**
 * @ClassName FilterEmployeeByAge
 * @Description TODO
 * @Author long
 * @Date 2022/12/29 19:00
 * @Version 1.0
 **/
public class FilterEmployeeByAge implements  MyPredicate<Employee>{
    @Override
    public boolean test(Employee t) {
        return t.getAge()>= 35;
    }
}

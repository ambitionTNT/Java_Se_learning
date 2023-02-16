package lambda;

/**
 * @ClassName FilerEmployeeBySalary
 * @Description TODO
 * @Author long
 * @Date 2022/12/29 19:12
 * @Version 1.0
 **/
public class FilerEmployeeBySalary implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary()>5000;
    }
}

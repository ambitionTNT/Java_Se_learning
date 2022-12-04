package abstractClasses;

import java.time.LocalDate;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author long
 * @Date 2022/9/3 18:25
 * @Version 1.0
 **/
public class Employee extends Person{
    private double salary;
    private LocalDate hireDay;

    public Employee(String name , double salary, int year,int month,int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }
}

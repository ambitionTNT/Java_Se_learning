package clone;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author long
 * @Date 2022/9/9 15:33
 * @Version 1.0
 **/
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(int year,int month,int day) {
        Date newHireDay = new GregorianCalendar(year,month,day).getTime();

        //employee of instance field mutable
        hireDay.setTime(newHireDay.getTime());

    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }



    protected Employee clone() throws CloneNotSupportedException {
        //call Object.clone()
        Employee cloned  = (Employee) super.clone();

        //clone mutable fields
        cloned.hireDay  = (Date) hireDay.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}

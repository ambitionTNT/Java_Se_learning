package eqals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author long
 * @Date 2022/9/3 23:04
 * @Version 1.0
 **/
public class Employee {

    private double salary;
    private LocalDate hireDay;
    private String name;

    public Employee(String name,double salary, int year,int month,int day) {
        this.name = name;
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



    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,salary,hireDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object otherObject) {
        //1. qa quick test to see if the objects are identical.
        if (this == otherObject) return true;

        //2.must return null if the explicit parameter is null.
        if (otherObject == null) return false;

        //3.if the classes don't match,they can't be equal.
        if (getClass() !=otherObject.getClass()) return false;

        //4.now we know otherObject is a non-null Employee.
        Employee other = (Employee) otherObject;

        //test whether the field have identical values.
        return Objects.equals(name,other.getName())
                && salary == other.salary && Objects.equals(hireDay,other.hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() +"[name=" + name +",salary" +getSalary()+",hireDay=" + hireDay+ "]";
    }
}

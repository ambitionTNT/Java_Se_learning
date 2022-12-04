package lambda;

import java.util.Objects;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author long
 * @Date 2022/9/14 15:24
 * @Version 1.0
 **/
public class Employee {
    private int stuId;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(int stuId) {
        this.stuId = stuId;
    }

    public Employee(int stuId, String name, int age, double salary) {
        this.stuId = stuId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getStuId() {
        return stuId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return stuId == employee.stuId &&
                age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, name, age, salary);
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

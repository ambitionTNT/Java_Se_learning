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
    private Integer age;
    private Double salary;
    private Status status;

    public Employee() {
    }

    public Employee(int stuId) {
        this.stuId = stuId;
    }

    public Employee(int stuId, String name) {
        this.stuId = stuId;
        this.name = name;
    }

    public Employee(int stuId, String name, Integer age, Double salary) {
        this.stuId = stuId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(int stuId, String name, Integer age, Double salary, Status status) {
        this.stuId = stuId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }

    public int getStuId() {
        return stuId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return stuId == employee.stuId &&
                Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(salary, employee.salary) &&
                status == employee.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, name, age, salary, status);
    }
}

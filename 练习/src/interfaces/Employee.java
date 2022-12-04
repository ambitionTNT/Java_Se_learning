package interfaces;

/**
 * @ClassName Employee
 * @Description This program demonstartes the use of the Comparable interface
 * @Author long
 * @Date 2022/9/9 10:49
 * @Version 1.0
 **/
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    /**
     * Compares employees by salary
     * @param o another Employee object
     * @return 0,1,-1
     */
    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary,o.getSalary());
    }
}

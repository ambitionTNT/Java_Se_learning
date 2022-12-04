import java.util.*;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom",40000);

        staff[1] = new Employee("Tom",50000);

        staff[2] = new Employee("Harry",89003);

        for (Employee e:staff){
            e.setId();
            System.out.println("name = "+e.getName()+ ",id ="+e.getId()+",salary");
        }
        int n = Employee.getNextId();

        System.out.println("Next available id = "+ n );

    }
}
class Employee{
    private static int nextId = 1;

    private String name = "";//instance field initialization;
    private double salary;
    private int id;

    static
    {
        Random generator = new Random();
        //set nextId to a random number between 0 and 9999;
        nextId =generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary){
        //calls the Employee(String , double)constructor;
        this("Employee #" + nextId,salary);
    }

    public Employee(){
        name = "";
        salary = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
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

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;


    }

    public static void main(String[] args) {
        Employee e = new Employee("Harry",5000);
        System.out.println(e.getName()+" " +e.getSalary());
    }


}
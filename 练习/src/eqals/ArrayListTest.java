package eqals;

import java.util.ArrayList;

/**
 * @ClassName ArrayListTest
 * @Description TODO
 * @Author long
 * @Date 2022/9/4 20:15
 * @Version 1.0
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        //fill the staff array list with three Employee objects;
        Integer n = 100;
        System.out.println("------------------------");

        System.out.println(Integer.valueOf("100",8));
        int m = n;
        System.out.println("************");
        System.out.println(Integer.toString(n));
        System.out.println(Integer.toString(m,8));

        System.out.println(Integer.toString(m).getClass().getName());

        System.out.println(n);
        System.out.println(n.toString());
        System.out.println(m);

        ArrayList staff = new ArrayList<Employee>();
        staff.add(new Employee("Carl Cracker",75000,1987,12,15));
        staff.add(new Employee("Harry Hacker",50000,1989,10,1));
        staff.add(new Employee("Tony Tester",40000,1990,3,15));

        //raise everyone's salary by 5%
        for(Object e:staff){
            Employee emp = (Employee)e;
            System.out.println("name=" + emp.getName(

            ) +",salary=" + emp.getSalary() + ".hireDay="+
                    ((Employee) e).getHireDay());
        }
    }
    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for (double v: values)
            if (v>largest)
                largest = v;
        return largest;
    }



}

package interfaces;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

/**
 * @ClassName EmployeeSort
 * @Description This program demonstartes the use of the Comparable interface
 * @Author long
 * @Date 2022/9/9 10:49
 * @Version 1.0
 **/
public class EmployeeSort {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker",35000);
        staff[1] = new Employee("Carl Cracker",75000);
        staff[2] = new Employee("Tony Tester",38000);
        Arrays.sort(staff);

        //print out information about all Employee objects

        for (Employee e: staff){
            System.out.println("name=" + e.getName() + ",salary= " + e.getSalary());
        }
    }


}

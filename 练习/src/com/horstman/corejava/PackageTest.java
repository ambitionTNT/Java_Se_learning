package com.horstman.corejava;
import static java.lang.System.*;
public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry Hacker",5000,1989,10,1);

        harry.raiseSalary(5);

        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}

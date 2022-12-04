package eqals;

import java.util.Map;
import java.util.Objects;

/**
 * @ClassName Manager
 * @Description TODO
 * @Author long
 * @Date 2022/9/4 8:41
 * @Version 1.0
 **/
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        //super.equals checked that this and other belong to the same class
        return bonus == other.bonus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),bonus);
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "bonus=" + bonus +
                '}';
    }
}

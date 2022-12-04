package eqals;


/**
 * @ClassName EqualsTest
 * @Description TODO
 *
 *
 *
 * @Author long
 * @Date 2022/9/4 9:05
 * @Version 1.0
 **/
public class EqualsTest {
    public static void main(String[] args) {

        int a;
       //g System.out.println(a);

        Employee alice1 = new Employee("Alice Adams",75000,1987,12,15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams",75000,1987,12,15);
        Employee bob = new Employee("Bob Brandson",5000,1989,10,1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println( "alice1.equals(bob): " + alice1.equals(bob));
        System.out.println("bob.toString(): " + bob);

        Manager carl = new Manager("Carl Cracker",8000,1989,12,15);
        Manager boss = new Manager("Carl Cracker",8000,1989,12,15);
        boss.setBonus(5000);
        System.out.println("------------------------------");
        System.out.println(boss.getSalary());
        System.out.println("boss.toString(): " + boss);
        System.out.println(carl);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode(): "+alice1.hashCode());
        System.out.println("alice3.88888hashCode(): "+alice3.hashCode());
        System.out.println("bob.hashCode(): "+bob.hashCode());
        System.out.println("carl.hashCode() " + carl.hashCode() );
    }
}

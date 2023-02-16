package java_Set.map;



import clone.Employee;

import java.util.HashMap;

/**
 * @ClassName MapTest
 * @Description This  program demonstrates the ues of a map with key type String and value type Employee
 * @Author long
 * @Date 2022/12/12 19:30
 * @Version 1.0
 **/
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2443", new Employee("Harry Hacker"));
        staff.put("157-62-8899", new Employee("Gary Cooper"));
        staff.put("343-23-5533", new Employee("Francesca Cruz"));
        //print all entries

        System.out.println(staff);

        //remove an entry

        staff.remove("144-25-5464");

        //replace an entry
        staff.put("343-23-5533", new Employee("Francesca Jack"));

        //look up a value

        System.out.println(staff.get("343-23-5533"));

        //iterate through all entries

        staff.forEach((k, v) ->
        System.out.println("key="+k+", value=" + v));

    }
}

package Map;

import java.util.HashSet;
import java.util.Set;

public class HashMapTest02 {
    public static void main(String[] args) {
        Student student1 = new Student(12,"张三");
        Student student2 = new Student(12,"张三");
        // 重写equals方法之前是false
        //System.out.println(s1.equals(s2)); // false
        System.out.println(student1.equals(student2));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        // s1.equals(s2)结果已经是true了，表示s1和s2是一样的，相同的，那么往HashSet集合中放的话，
        // 按说只能放进去1个。（HashSet集合特点：无序不可重复）
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students.size());
    }
}

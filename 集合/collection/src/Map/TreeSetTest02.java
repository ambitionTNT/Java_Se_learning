package Map;

import com.sun.deploy.panel.ITreeNode;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        Student s1 = new Student(20,"zhangsan");
        Student s2 = new Student(22,"Jack");
        Student s3 = new Student(12,"Luck");
        Student s4 = new Student(24,"Rose");
        Student s5 = new Student(40,"Tom");
        Student s6 = new Student(33,"Jerry");
        Student s7 = new Student(22,"Jerry");
        TreeSet<Student> students = new TreeSet<>();
        TreeSet<Student> studentTreeSet = new TreeSet<>();
        System.out.println(studentTreeSet.size());



        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        for (Student s:students){
            System.out.println(s);
        }
        System.out.println("---------------------------");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------------");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

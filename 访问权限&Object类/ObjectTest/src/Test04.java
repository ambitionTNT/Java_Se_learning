import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Objects;

public class Test04 {
    // String对象比较的时候必须使用equals方法。
    public static void main(String[] args) {
        Student s1 = new Student(111,new String("北京大学"));
        Student s2 = new Student(111,new String("清华大学"));
        Student s3 = new Student(111,new String("北京大学"));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
class Student{
    int no;
    String school;

    public Student() {
    }

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "no=" + no + ", school='" + school ;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null&&!(o instanceof Student)) return false;
        Student s = (Student)o;
        return this.no==s.no&&this.school.equals(s.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, school);
    }
}
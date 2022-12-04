package Map;

import java.util.Objects;

public class Student  implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(int age,String name) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public int compareTo(Student o) {
        if (this.age==o.getAge()){
            return this.name.compareTo(o.name);
        }else return this.age-o.getAge();
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAge()==o.getAge()){
            return this.name.compareTo(o.name);
        }else return this.age-o.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

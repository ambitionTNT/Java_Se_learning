package bean;

import javax.crypto.spec.PSource;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 4443644181403304807L;
    private int no;
    private String name;//表示name不参与序列化操作。
    private int age;
    //private static final long serialVersionUID = 10L;
    private String email;


    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}

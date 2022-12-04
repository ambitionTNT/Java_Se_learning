import bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101,"Jack"));
        students.add(new Student(102,"Tom"));
        students.add(new Student(103,"Frank"));
        students.add(new Student(104,"King"));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Students"));
            oos.writeObject(students);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

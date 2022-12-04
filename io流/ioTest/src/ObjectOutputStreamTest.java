import bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        Student s1 = new Student(10001,"Jack");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Students"));
            oos.writeObject(s1);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

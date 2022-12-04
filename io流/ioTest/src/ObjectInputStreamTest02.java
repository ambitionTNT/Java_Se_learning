import bean.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Students"));
            /*Object o = ois.readObject();
            System.out.println(o instanceof List);*/
            List<Student> students = (List<Student>) ois.readObject();
            for (Student s :students){
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class InterfaceTest {
    public static void main(String[] args) {
        //new StudentManager();
        StudentManager sm1 = new Student();
        SchoolManager sm2 = new Student();
        Student s1 = (Student)sm1;
        //School s2 = (Student)s1;
        //s2.A();
        System.out.println(StudentManager.SCHNAME);


        M m = new J();
        K k = (K)m;

    }
}

interface StudentManager{
    public abstract void printInfo();
    public void addStudent(String name,int id);
    //private void doSome(){};
    public final static String SCHNAME = "北京大学";
    int xuezhi = 7;

}
interface SchoolManager{
    public void doSome();

}

interface RoomManager extends StudentManager,SchoolManager {
    public void doOther();

}
class Student implements SchoolManager,StudentManager{
    public void printInfo(){}
    public void addStudent(String name,int id){}
    public void doSome(){}
}
class School implements RoomManager{
    public void doOther(){}
    public void addStudent(String name,int id){}
    public void printInfo(){}
    public void doSome(){}
    public void A(){
        System.out.println(StudentManager.SCHNAME);

    }
}

interface A1{
    void m1();
}

interface B1{
    void m2();
}

interface C{
    void m3();
}

// 实现多个接口，其实就类似于多继承。
class D implements A1,B1,C{
    // 实现A接口的m1()
    public void m1(){

    }
    // 实现B接口中的m2()
    public void m2(){
        System.out.println("m2 ....");
    }
    // 实现接口C中的m3()
    public void m3(){

    }
}

interface M{}
interface K{}
class J implements M{}
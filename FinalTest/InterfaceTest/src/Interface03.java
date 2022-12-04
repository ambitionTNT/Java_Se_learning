public class Interface03 {
    public static void main(String[] args) {
        StudentMySqlImpl s1 = new StudentMySqlImpl();
        s1.addStudent(1,"jack");
        s1.delStudent(1);
        s1.modifyStudent(1,"Tom");

        StudentOracleImpl s2 = new StudentOracleImpl();
        s2.add(1,"jack");
        s2.del(1);
        s2.modify(1,"tom");
    }
}


class StudentOracleImpl{
    public void add(int id,String name){
        System.out.println("StudentOracleImpl.add");
    }
    public void del(int id){
        System.out.println("StudentOracleImpl.del");
    }
    public void modify(int id ,String name){
        System.out.println("StudentOracleImpl.modify");
    }
}

class StudentMySqlImpl {
    public void addStudent(int id,String name){
        System.out.println("StudentMySqlImpl.addStudent");
    }
    public void delStudent(int id){
        System.out.println("StudentMySqlImpl.delStudent");
    }
    public void modifyStudent(int id,String name){
        System.out.println("StudentMySqlImpl.modifyStudent");
    }

}

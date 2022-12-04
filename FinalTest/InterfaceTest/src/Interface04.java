public class Interface04 {
    public static void main(String[] args) {
        IsStudent is1 = new Student2OracleImpl();
        is1.add(1,"jack");
        is1.del(1);
        is1.modify(1,"Tom");

    }
    public static void doCrud(IsStudent is){
        is.add(1,"jack");
        is.del(1);
        is.modify(1,"Tom");
    }
}

interface IsStudent{
    public void add(int id,String name);
    public void del(int id);
    public void modify(int id,String name);
}

class Student2OracleImpl implements IsStudent{
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

class Student2MySqlImpl implements IsStudent{
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



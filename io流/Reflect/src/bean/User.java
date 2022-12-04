package bean;

public class User{
    // Field
    int no;

    // Constructor
    public User(){
        System.out.println("User的无参构造方法!");
    }
    public User(int no){
        this.no = no;
    }

    // Method
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
}
package HomeWork;

public class UserService {
    User[] users=null;
    int top=0;
    public UserService() {
        this.users = new User[100];
        this.top=-1;

    }

    public void register(String userName, String password) throws NotEmptyException, IlleagelNameException {
        if (userName==null||userName.toCharArray().length<6||userName.toCharArray().length>14){
            IlleagelNameException nameException = new IlleagelNameException("注册时用户名要求长度在[6-14]之间");
            throw nameException;
        }
        User user = new User(userName,password);
        if (this.top == users.length){
            NotEmptyException notEmptyException = new NotEmptyException("内存已满，不能再次注册");
            throw notEmptyException;
        }else {
            users[++top] = user;
        }

    }


}

class User{
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}


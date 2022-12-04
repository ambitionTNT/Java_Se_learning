package HomeWork;

import java.util.Scanner;

/*编写程序模拟用户注册：
1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
2、输入信息之后，后台java程序模拟用户注册。
3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。

注意：
    完成注册的方法放到一个单独的类中。
    异常类自定义即可。

    class UserService {
        public void register(String username,String password){
            //这个方法中完成注册！
        }
    }

    编写main方法，在main方法中接收用户输入的信息，在main方法
    中调用UserService的register方法完成注册。
*/
public class HomeWorkTest01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        UserService service = new UserService();
        System.out.print("请输入用户名：");
        String userName = s.nextLine();
        System.out.print("请输入密码：");
        String password = s.nextLine();
        try {
            service.register(userName,password);
        } catch (NotEmptyException e) {
            System.out.println(e.getMessage());

            e.printStackTrace();
        } catch (IlleagelNameException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }


}
